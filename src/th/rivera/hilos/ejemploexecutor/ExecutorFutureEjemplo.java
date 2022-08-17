package th.rivera.hilos.ejemploexecutor;

import java.util.concurrent.*;

public class ExecutorFutureEjemplo {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService executor = Executors.newSingleThreadExecutor();

    Callable<String> task = () -> { //Callable retorna un valor, Runnable no
      System.out.println("Inicio de la tarea...");
      try {
        System.out.println("Nombre del thread " + Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(3);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        e.printStackTrace();
      }
      System.out.println("Finaliza la tarea...");
      return "Obtiene algún resultado importante de la tarea";
    };

    Future<String> result = executor.submit(task); //Obtengo el valor futuro, "submit()" puede invocar "Runnable" o "Callable" pero "Callable" retorna algo, con "RUNNABLE" es <?>
    executor.shutdown();
    System.out.println("Continuando con ejecución del método MAIN");
    System.out.println("Resultado futuro isDone antes del get " + result.isDone());

    while( !result.isDone() ) {
      System.out.println("Ejecutando tarea...");
      TimeUnit.MILLISECONDS.sleep(1500);
    }

    System.out.println("Resultado futuro get " + result.get()); //"get" bloquea el método main hasta que finalice el Thread, le puedo dar parámetros al "get" (seg, TimeUnit.SECONDS)
    System.out.println("Continuamos");
    System.out.println("Resultado futuro isDone después del get " + result.isDone());

  }
}
