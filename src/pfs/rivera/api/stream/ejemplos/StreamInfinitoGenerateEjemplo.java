package pfs.rivera.api.stream.ejemplos;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class StreamInfinitoGenerateEjemplo {
  public static void main(String[] args) {
    System.out.println("Impresión de forma infinita y/o limitada");
    AtomicInteger counter = new AtomicInteger(0);
    Stream.generate( () -> {
              try {
                TimeUnit.SECONDS.sleep(2);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
              return counter.incrementAndGet();
            })
            .limit(10) //Si no pongo limite sera infinito el return
            .forEach(System.out::println);


  }
}
