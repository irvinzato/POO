package th.rivera.hilos.ejemplosync.runnable;

import th.rivera.hilos.ejemplosync.Panaderia;

public class Consumidor implements Runnable{
  private Panaderia bakery;

  public Consumidor(Panaderia bakery) {
    this.bakery = bakery;
  }

  @Override
  public void run() {
    for( int i = 0; i < 10; i++ ) {
      this.bakery.consumeBread();
    }
  }
}
