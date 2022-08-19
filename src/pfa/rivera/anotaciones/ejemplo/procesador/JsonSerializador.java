package pfa.rivera.anotaciones.ejemplo.procesador;

import pfa.rivera.anotaciones.ejemplo.Init;
import pfa.rivera.anotaciones.ejemplo.JsonAtributo;
import pfa.rivera.anotaciones.ejemplo.procesador.exception.JsonSerializadorException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

//Para que funciones el proceso de generar JSON con cualquier objeto
public class JsonSerializador {

  //Método para anotación "Init" aplicada en métodos
  public static void initializeObject(Object obj) {
    if( obj == null ) {
      throw new JsonSerializadorException("El objeto a serializar no puede ser null !");
    }

    Method[] methods = obj.getClass().getDeclaredMethods();

    Arrays.stream(methods).filter(m -> m.isAnnotationPresent(Init.class))
            .forEach(m -> {
              m.setAccessible(true);
              try {
                m.invoke(obj); //Por cada método que tenga la notación invoco el objeto
              } catch (IllegalAccessException | InvocationTargetException e) {
                throw new JsonSerializadorException("Error en notación de método serializar" + e.getMessage());
              }
            });
  }

  //Método para anotación "JsonAtributo" aplicada en campos
  public static String convertJSON(Object obj) {

    if( obj == null ) {
      throw new JsonSerializadorException("El objeto a serializar no puede ser null !");
    }

    initializeObject(obj); //Llamo al método de arriba
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
                          //Lo siguiente es por si quiero agregar mayúscula después de cada espacio
                          /*newValue = Arrays.stream( newValue.split(" ") )
                                          .map( pal -> pal.substring(0, 1).toUpperCase() + pal.substring(1).toLowerCase() )
                                          .collect(Collectors.joining(" ")); //parecido al "reduce", junta todos los elementos en uno solo con el separador espacio*/
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
