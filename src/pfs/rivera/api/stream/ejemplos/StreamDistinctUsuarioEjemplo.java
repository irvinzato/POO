package pfs.rivera.api.stream.ejemplos;

import pfs.rivera.api.stream.ejemplos.models.Usuario;
import java.util.stream.Stream;

public class StreamDistinctUsuarioEjemplo {
  public static void main(String[] args) {
    System.out.println("Se implemento 'equals' en Objeto y dist en esta clase para no permitir objetos duplicados");
    Stream<Usuario> names = Stream
            .of("Irving Rivera", "Naomi Guzman", "Angeles Lopez", "Mauricio Banderley", "Naomi Marley"
                , "Irving Rivera", "Irving Rivera")
            .map( name -> new Usuario( name.split(" ")[0], name.split(" ")[1] ))
            .distinct();

    System.out.println("Recorrido del Stream");
    names.forEach(System.out::println);




  }
}
