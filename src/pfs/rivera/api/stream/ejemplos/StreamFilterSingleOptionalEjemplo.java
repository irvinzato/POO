package pfs.rivera.api.stream.ejemplos;

import pfs.rivera.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamFilterSingleOptionalEjemplo {
  public static void main(String[] args) {
    System.out.println("Función mas profunda del objeto 'Optional'");
    Stream<Usuario> names = Stream
            .of("Irving Rivera", "Naomi Guzman", "Angeles Lopez", "Mauricio Banderley", "Naomi Marley")
            .map( name -> new Usuario( name.split(" ")[0], name.split(" ")[1] ))
            .filter( user -> user.getName().equals("Naomis") )
            .peek( user -> System.out.println(user.getName()) );

    System.out.println("Recuperación de solo un elemento, usando Optional y findFirst");
    Optional<Usuario> user = names.findFirst();
    System.out.println("Se encontró al usuario " + user.orElse(new Usuario("Por", "Defecto")));
    //Mismo resultado pero con expresión lambda
    //System.out.println("Se encontró al usuario " + user.orElseGet( () -> new Usuario("Por", "Defecto")));

    if( user.isPresent() ) {
      System.out.println( user.get() );
    } else {
      System.out.println("No se encontro el objeto");
    }




  }
}
