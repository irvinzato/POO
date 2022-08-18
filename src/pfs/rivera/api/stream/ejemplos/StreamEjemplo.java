package pfs.rivera.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEjemplo {
  public static void main(String[] args) {
    //Analogía de máquina que empaqueta productos, flujo que puede ser modificado
    System.out.println("Primer Stream: ");
    Stream<String> names = Stream.of("Irving", "Naomi", "Angeles", "Mauricio");
    //Para realizar algún trabajo con el stream se ocupan los operadores
    names.forEach(System.out::println);

    System.out.println("Stream numero 2, en base a un arreglo");
    String[] arr = {"Irving", "Naomi", "Angeles", "Mauricio"};
    Stream<String> names2 = Arrays.stream(arr);
    names2.forEach(System.out::println);

    System.out.println("Stream numero 3, con Stream - builder");
    Stream<String> names3 = Stream.<String>builder().add("Irving")
            .add("Naomi").add("Angeles").add("Mauricio").build();
    names3.forEach(System.out::println);

    System.out.println("Stream numero 4, a partir de un tipo 'Collection'");
    List<String> list = new ArrayList<>();
    list.add("Irving");
    list.add("Naomi");
    list.add("Angeles");
    list.add("Mauricio");

    Stream<String> names4 = list.stream();
    names4.forEach(System.out::println);

  }
}
