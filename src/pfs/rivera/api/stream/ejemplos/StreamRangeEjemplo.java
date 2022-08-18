package pfs.rivera.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class StreamRangeEjemplo {
  public static void main(String[] args) {
    System.out.println("Creación de flujos mediante rangos de enteros con IntStream, range no incluye el ultimo numero, rangeClosed si");
    IntStream range = IntStream.range(5, 20).peek(System.out::println);

    //Lo que esta comentado es otra forma de hacer la suma pero con método del "IntStream" - "sum()
    //Integer result = range.reduce(0, (a, b) -> a + b);
    //int result2 = range.sum();
    //System.out.println(result);

    IntSummaryStatistics stats = range.summaryStatistics(); //Otra forma que da más opciones a conocer en un rango
    System.out.println("stats = " + stats);
    System.out.println("stats.getMax() = " + stats.getMax());
    System.out.println("stats.getMin() = " + stats.getMin());
    System.out.println("stats.getSum() = " + stats.getSum());
    System.out.println("stats.getAvarege() = " + stats.getAverage());
    System.out.println("stats.getCount() = " + stats.getCount());


  }
}
