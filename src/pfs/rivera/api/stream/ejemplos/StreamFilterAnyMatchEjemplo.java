package pfs.rivera.api.stream.ejemplos;

import pfs.rivera.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class StreamFilterAnyMatchEjemplo {
  public static void main(String[] args) {
    System.out.println("¿Existe o no existe?");
    boolean exist = Stream
            .of("Irving Rivera", "Naomi Guzman", "Angeles Lopez", "Mauricio Banderley", "Naomi Marley") //Pudiera tener una lista de Usuarios directamente, asi no tendría el primer map
            .map( name -> new Usuario( name.split(" ")[0], name.split(" ")[1] ))
            .peek(System.out::println)
            .anyMatch( u -> u.getId().equals(3) );  //En lugar de buscar por nombre, por ID

    System.out.println("Se encontró al usuario - " + exist );




  }
}
