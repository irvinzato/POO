package pfs.rivera.api.stream.ejemplos;

import pfs.rivera.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamDistinctEjemplo {
  public static void main(String[] args) {
    System.out.println("Todos los repetidos no se incluyen");
    Stream<String> names = Stream.of("Irving Rivera", "Naomi Guzman", "Angeles Lopez", "Mauricio Banderley", "Naomi Marley"
              , "Irving Rivera", "Irving Rivera", "Irving Rivera")
              .distinct();

    names.forEach(System.out::println );


  }
}
