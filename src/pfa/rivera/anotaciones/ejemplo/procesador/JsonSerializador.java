package pfa.rivera.anotaciones.ejemplo.procesador;

import pfa.rivera.anotaciones.ejemplo.JsonAtributo;
import pfa.rivera.anotaciones.ejemplo.procesador.exception.JsonSerializadorException;

import java.lang.reflect.Field;
import java.util.Arrays;

public class JsonSerializador {
  //Para que funciones el proceso de generar JSON con cualquier objeto

  public static String convertJSON(Object obj) {

    if( obj == null ) {
      throw new JsonSerializadorException("El objeto a serializar no puede ser null !");
    }

    Field[] fields = obj.getClass().getDeclaredFields();
    return Arrays.stream(fields).filter(f -> f.isAnnotationPresent(JsonAtributo.class) )
                    .map( f -> {
                      f.setAccessible(true);
                      String name = f.getAnnotation(JsonAtributo.class).nameAn().equals("")
                              ? f.getName()
                              : f.getAnnotation(JsonAtributo.class).nameAn();
                      try {
                        Object value = f.get(obj);
                        if( f.getAnnotation(JsonAtributo.class).capitalize() && value instanceof String) {
                          String newValue = (String) value;
                          newValue = newValue.substring(0, 1).toUpperCase() + newValue.substring(1).toLowerCase(); //El primer carácter en mayúscula y el resto minúscula
                          f.set(obj, newValue);       //Le paso el nuevo valor al objeto
                        }
                        return "\"" + name + "\":\"" + f.get(obj) + "\"";
                      } catch (IllegalAccessException e) {
                        throw new JsonSerializadorException("Error al serializar a JSON: " + e.getMessage());
                      }
                    })
                    .reduce("{", (a, b) -> {
                      if( "{".equals(a) ) {
                        return a + b;
                      }
                      return a + ", " + b;
                    }).concat("}");
  }

}
