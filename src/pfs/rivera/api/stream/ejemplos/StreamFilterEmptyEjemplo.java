package pfs.rivera.api.stream.ejemplos;

import java.util.stream.Stream;

public class StreamFilterEmptyEjemplo {
  public static void main(String[] args) {
    System.out.println("¿Cuantos espacios vacíos hay?");
    long count = Stream
            .of("Irving Rivera", "Naomi Guzman", "", "Angeles Lopez", "Mauricio Banderley", " ", "Naomi Marley")
            .filter( name -> name.trim().isEmpty() )
            .peek(System.out::println)
            .count();

    System.out.println("El contador es: " + count);






  }
}
