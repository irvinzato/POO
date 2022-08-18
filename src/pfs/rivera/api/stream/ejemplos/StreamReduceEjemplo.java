package pfs.rivera.api.stream.ejemplos;

import java.util.stream.Stream;

public class StreamReduceEjemplo {
  public static void main(String[] args) {
    System.out.println("Reduce el Stream a un solo resultado STRING, 'reduce'");
    Stream<String> names = Stream.of("Irving Rivera", "Naomi Guzman", "Angeles Lopez", "Mauricio Banderley", "Naomi Marley"
              , "Irving Rivera", "Irving Rivera", "Irving Rivera")
              .distinct();

    String result = names.reduce("resultado concatenación", (a,b) -> a + " , " + b);
    System.out.println(result);

  }
}
