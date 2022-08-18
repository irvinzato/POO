package pfs.rivera.api.stream.ejemplos;

import pfs.rivera.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class StreamFilterCountEjemplo {
  public static void main(String[] args) {
    System.out.println("¿Cuantos elementos hay?");
    long count = Stream
            .of("Irving Rivera", "Naomi Guzman", "Angeles Lopez", "Mauricio Banderley", "Naomi Marley") //Pudiera tener una lista de Usuarios directamente, asi no tendría el primer map
            .map( name -> new Usuario( name.split(" ")[0], name.split(" ")[1] ))
            .peek(System.out::println)
            .count();

    System.out.println("Se encontró al usuario - " + count );




  }
}
