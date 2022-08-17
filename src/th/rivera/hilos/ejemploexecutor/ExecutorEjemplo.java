package th.rivera.hilos.ejemploexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorEjemplo {
  public static void main(String[] args) throws InterruptedException {
    ExecutorService executor = Executors.newSingleThreadExecutor();

    Runnable task = () -> { //También pudiera implementar el método "run()" pero lo hago con expresión lambda
      System.out.println("Inicio de la tarea...");
      try {
        System.out.println("Nombre del thread " + Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(1); //Muy parecido a Thread.sleep pero más optimizado
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt(); //Para interrumpir la ejecución actual, opcional
        e.printStackTrace();
      }
      System.out.println("Finaliza la tarea...");
    };

    executor.submit(task); //Para mandar el executor pero hay que detenerlo
    executor.shutdown();  //Para apagar una vez finaliza la ejecución
    System.out.println("Continuando con ejecución del método MAIN 1");
    executor.awaitTermination(2, TimeUnit.SECONDS); //Espera a que finalicen todas las tareas para seguir, pero el tiempo debe coincidir
    System.out.println("Continuando con ejecución del método MAIN 2");
  }
}
