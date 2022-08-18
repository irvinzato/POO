package pfs.rivera.api.stream.ejemplos;

import pfs.rivera.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class StreamFilterSingle2Ejemplo {
  public static void main(String[] args) {
    System.out.println("Recuperación de un solo elemento simplificado !");
    Usuario user = Stream
            .of("Irving Rivera", "Naomi Guzman", "Angeles Lopez", "Mauricio Banderley", "Naomi Marley")
            .map( name -> new Usuario( name.split(" ")[0], name.split(" ")[1] ))
            .filter( u -> u.getId().equals(3) )  //En lugar de buscar por nombre, por ID
            .findFirst().get();

    System.out.println("Se encontró al usuario " + user );




  }
}
