package th.rivera.hilos.ejemploexecutor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ScheduledExecutorServicePeriodoEjemplo {
  public static void main(String[] args) throws InterruptedException {

    ScheduledExecutorService executer = Executors.newScheduledThreadPool(2);
    System.out.println("Alguna tarea en el main...");
    CountDownLatch lock = new CountDownLatch(5); //Muy similar al atomic y de hecho también pudiera usarlo
    //AtomicInteger counter = new AtomicInteger(5);

    Future<?> future = executer.scheduleAtFixedRate( () -> { //Obtener el "Future" es opcional
      System.out.println("Tarea programada...");
      try {
        TimeUnit.MILLISECONDS.sleep(1000);
        lock.countDown(); //Va descontando cada que se ejecuta la tarea
        //counter.getAndDecrement();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }, 1000, 2000 ,TimeUnit.MILLISECONDS);

    lock.await(); //Bloquea el Thread hasta llegar a 0
    future.cancel(true); //Cuando llegue a 0 cancelo

    /* Otra solución, utilizando "AtomicInteger"
    while( counter.get() >= 0 ) {
      if( counter.get() == 0 ) {
        future.cancel(true);
        counter.getAndDecrement();
      }
    }*/

    //TimeUnit.SECONDS.sleep(10); //Durante un tiempo u otra forma es durante una cantidad de veces
    System.out.println("Alguna otra tarea en el main...");
    executer.shutdown();

  }
}
