package pfs.rivera.api.stream.ejemplos;

import pfs.rivera.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterEjemplo {
  public static void main(String[] args) {
    System.out.println("Filter para retornar quienes cumplan la condición");
   Stream<Usuario> names2 = Stream
            .of("Irving Rivera", "Naomi Guzman", "Angeles Lopez", "Mauricio Banderley", "Naomi Marley")
            .map( name -> new Usuario( name.split(" ")[0], name.split(" ")[1] ))
            .filter( user -> user.getName().equals("Naomi") )
            .peek( user -> System.out.println(user.getName()) );

    System.out.println("Stream a lista");
    List<Usuario> list2 = names2.collect(Collectors.toList());
    list2.forEach(user -> System.out.println(user));




  }
}
