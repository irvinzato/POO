package pfd.rivera.java8.datetime.ejemplos;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class Duration2Ejemplo {
  public static void main(String[] args) {
    System.out.println("En estos ejemplos usare Instant - Es un instante de tiempo");

    Instant i1 = Instant.now();
    try {
      TimeUnit.SECONDS.sleep(3);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Instant i2 = Instant.now();
    Duration time = Duration.between(i1, i2); //También puedo pasar instantes
    System.out.println("Duración entre instantes: " + time);

  }
}
