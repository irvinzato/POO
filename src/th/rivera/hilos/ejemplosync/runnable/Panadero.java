package th.rivera.hilos.ejemplosync.runnable;

import th.rivera.hilos.ejemplosync.Panaderia;
import java.util.concurrent.ThreadLocalRandom;

public class Panadero implements Runnable{
  private Panaderia bakery;

  public Panadero(Panaderia bakery) {
    this.bakery = bakery;
  }

  @Override
  public void run() {
    for( int i = 0; i < 10; i++ ) {
      this.bakery.bake("Pan n°: " + i);
      try {
        Thread.sleep(ThreadLocalRandom.current().nextInt(500, 3000)); //Random propio de los hilos
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
