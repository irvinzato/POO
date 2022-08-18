package pfs.rivera.api.stream.ejemplos;

import pfs.rivera.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapEjemplo {
  public static void main(String[] args) {
    //El map siempre regresa un dato(transforma)
    Stream<String> names = Stream.of("Irving", "Naomi", "Angeles", "Mauricio")
            .map(name -> name.toUpperCase())
            .peek( e -> System.out.println(e) ) //Inspecciona, solamente mira los elementos para ver como van(parecido a forEach)
            .map(String::toLowerCase); //Se puede usar método de referencia

    //System.out.println("forEach de stream names");
    //names.forEach(System.out::println);

    System.out.println("Conversión de Stream a List");
    List<String> list = names.collect(Collectors.toList());
    list.forEach(System.out::println);


    //SEGUNDA PARTE - Transforme String a Objeto o tipo de una clase. Mucho más simple hacer la transformación que con puras listas
    System.out.println("EMPIEZA EL SEGUNDO EJEMPLO CON MAP - Transformar String a objetos. Primer map importante");
    Stream<Usuario> names2 = Stream
            .of("Irving Rivera", "Naomi Guzman", "Angeles Lopez", "Mauricio Banderley")
            .map( name -> new Usuario( name.split(" ")[0], name.split(" ")[1] )) //Resalto esta transformación
            .peek( user -> System.out.println(user.getName()) )
            .map( user -> {
              String name = user.getName().toUpperCase();
              user.setName(name);
              return user;
            });

    System.out.println("Stream de tipo Usuario mediante Strings y lista");
    List<Usuario> list2 = names2.collect(Collectors.toList());
    list2.forEach(user -> System.out.println(user)); //Implemente "toString"




  }
}
