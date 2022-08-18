package pfs.rivera.api.stream.ejemplos;

import java.util.stream.Stream;

public class StreamReduceIntEjemplo {
  public static void main(String[] args) {
    System.out.println("Reduce el Stream a un solo resultado ENTERO, 'reduce'");
    Stream<Integer> numbers = Stream.of(5, 10, 15, 20);

    //El primer argumento es donde comienza
    Integer result = numbers.reduce(0, (a, b) -> a + b);
    System.out.println(result);

  }
}
