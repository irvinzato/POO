package pfa.rivera.anotaciones.ejemplo;

import pfa.rivera.anotaciones.ejemplo.models.Producto;

import java.lang.reflect.Field; //API de reflección
import java.time.LocalDate;
import java.util.Arrays;

public class AnotacionEjemplo {
  public static void main(String[] args) {

    Producto p = new Producto();
    p.setDate(LocalDate.now());
    p.setName("Mesa de centro roble");
    p.setPrice(1500L);

    Field[] fields = p.getClass().getDeclaredFields(); //Obtengo campos de la clase "Producto"
    //Me interesa procesar solamente las variables que tengan el decorador "@JsonAtributo"
    String json = Arrays.stream(fields).filter( f -> f.isAnnotationPresent(JsonAtributo.class) )
                          .map( f -> { //Ya tengo los campos anotación, ahora los transformo a estructura JSON
                            f.setAccessible(true); //IMPORTANTE: para que el campo a pesar de ser privado se pueda leer mediante reflexión
                            String name = f.getAnnotation(JsonAtributo.class).nameAn().equals("")
                                          ? f.getName()
                                          : f.getAnnotation(JsonAtributo.class).nameAn();
                            try {
                              return "\"" + name + "\":\"" + f.get(p) + "\""; //El "get" es el valor del objeto pide try-catch
                            } catch (IllegalAccessException e) {
                              throw new RuntimeException("Error al serializar a JSON: " + e.getMessage());
                            }
                          })
                          .reduce("{", (a, b) -> {  //Para reducir todos los campos a una sola salida
                            if( "{".equals(a) ) {
                              return a + b;
                            }
                            return a + ", " + b;
                          }).concat("}");

    System.out.println("JSON generado: " + json); //La fecha no aparece porque no esta anotada


  }
}
