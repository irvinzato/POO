package th.rivera.hilos.ejemploexecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceEjemplo {
  public static void main(String[] args) {

    ScheduledExecutorService executer = Executors.newScheduledThreadPool(2);
    System.out.println("Alguna tarea en el main...");

    executer.schedule( () -> {
      try {
        TimeUnit.MILLISECONDS.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Tarea programada...");
    }, 0, TimeUnit.MILLISECONDS);

    System.out.println("Alguna otra tarea en el main...");
    executer.shutdown();

  }
}
