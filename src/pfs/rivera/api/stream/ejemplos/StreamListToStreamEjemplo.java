package pfs.rivera.api.stream.ejemplos;

import pfs.rivera.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamListToStreamEjemplo {
  public static void main(String[] args) {
    System.out.println("La idea es combertir una lista a un stream");
    List<Usuario> list = new ArrayList<>();
    list.add(new Usuario("Irving", "Rivera"));
    list.add(new Usuario("Angeles", "Lopez"));
    list.add(new Usuario("Jade", "Guzman"));
    list.add(new Usuario("Aketzalli", "Lopez"));
    list.add(new Usuario("Jesus", "Silva"));
    list.add(new Usuario("Jesus", "Smith"));
    list.add(new Usuario("Naomi", "Ruiz"));

    //Si filtro antes del map, seria sobre los objetos Usuario, después seria con los Strings
    Stream<String> namesFind = list.stream().map( u -> u.getName().toUpperCase().concat(" ")
                                                .concat(u.getLastName().toUpperCase()))
                                                .flatMap( name -> {  //parecido al filter
                                                  if( name.contains("jesus".toUpperCase()) )  {
                                                    return Stream.of(name);
                                                  }
                                                  return Stream.empty();
                                                })
                                                .peek(System.out::println);

    System.out.println("Total de resultados: " + namesFind.count());


  }
}
