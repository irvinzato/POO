package th.rivera.hilos.ejemplos;

import th.rivera.hilos.ejemplos.runnable.ViajeTarea;

public class InterfaceRunnableJava8Ejemplo {
  public static void main(String[] args) {
    //Creo en la misma clase, el método que van a implementar los hilos
    Runnable trip = new Runnable() {  //se puede cambiar a expresiones lambda
      @Override
      public void run() {
        for( int i = 0; i < 10; i++ ) {
          System.out.println(i + " - " + Thread.currentThread().getName()); //"Thread" tiene su propiedad "currentThread" para saber que hilo se está ejecutando
          try {
            Thread.sleep((long)(Math.random() * 2000) );
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        System.out.println("Finalmente me voy de viaje a " + Thread.currentThread().getName() );
      }
    };
    //El constructor permite pasarle una instancea de "Runnable" y el nombre del "Thread"
    new Thread(trip, "Tulum").start();
    new Thread(trip, "Yucatan").start();
    new Thread(trip, "Inglaterra").start();
    new Thread(trip, "Machu Pichu").start();


  }
}
