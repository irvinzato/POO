package th.rivera.hilos.ejemplosync;

import java.util.concurrent.ThreadLocalRandom;

public class ProductorConsumidorJava8Ejemplo {
  public static void main(String[] args) {
    Panaderia p = new Panaderia();

    //El contenido de los métodos "run()" pasan a cuando creo los hilos y uso "p" para acceder a los otros métodos
    new Thread( () -> {
      for( int i = 0; i < 10; i++ ) {
        p.bake("Pan n°: " + i);
        try {
          Thread.sleep(ThreadLocalRandom.current().nextInt(500, 3000));
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }).start();

    new Thread( () -> {
      for( int i = 0; i < 10; i++ ) {
        p.consumeBread();
      }
    }).start();


  }
}
