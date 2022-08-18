package pfs.rivera.api.stream.ejemplos;

import pfs.rivera.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMapEjemplo {
  public static void main(String[] args) {
    System.out.println("FlatMap devuelve un STREAM del objeto(otro flujo), en lugar de Filter. Al final seria lo mismo");
    Stream<Usuario> names = Stream
            .of("Irving Rivera", "Naomi Guzman", "Angeles Lopez", "Mauricio Banderley", "Naomi Marley")
            .map( name -> new Usuario( name.split(" ")[0], name.split(" ")[1] ))
            .flatMap( user -> {
              if( user.getName().equalsIgnoreCase("Mauricio") ) {
                return Stream.of(user);
              }
              return Stream.empty();
            });


    names.forEach(user -> System.out.println(user));
    //System.out.println("Count: " + names.count());


  }
}
