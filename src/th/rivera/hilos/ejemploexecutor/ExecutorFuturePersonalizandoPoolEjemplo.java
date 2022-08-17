package th.rivera.hilos.ejemploexecutor;

import java.util.concurrent.*;

public class ExecutorFuturePersonalizandoPoolEjemplo {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    //"ThreadPoolExecutor" es la forma concreta de "ExecutorService"
    ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2); //Con "1" sería secuencial

    System.out.println("Tamaño del Pool: " + executor.getPoolSize());
    System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size()); //Debe ser 0 porque no he añadido tareas al ejecutor

    Callable<String> task = () -> {
      System.out.println("Inicio de la tarea 1...");
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

    Callable<Integer> task2 = () -> {
      System.out.println("Iniciando tarea 2...");
      TimeUnit.SECONDS.sleep(3);
      return 10;
    };

    Future<String> result = executor.submit(task);
    Future<String> result2 = executor.submit(task);
    Future<Integer> result3 = executor.submit(task2);

    System.out.println("Tamaño del Pool: " + executor.getPoolSize());
    System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size()); //Después de agregar tareas al ejecutor

    executor.shutdown();
    System.out.println("Continuando con ejecución del método MAIN");
    System.out.println("Resultado futuro isDone antes del get " + result.isDone());

    while( !( result.isDone() && result2.isDone() && result3.isDone() ) ) { //Mientras no finalicen las 3 tareas
      System.out.println( String.format("resultado 1: %s - resultado 2: %s - resultado 3: %s",
              result.isDone() ?"finalizo" :"en proceso",
              result2.isDone() ?"finalizo" : "en proceso",
              result3.isDone() ?"finalizo" : "en proceso") );
      TimeUnit.MILLISECONDS.sleep(1500);
    }

    System.out.println("Resultado tarea 1 futuro get " + result.get());
    System.out.println("Resultado tarea 2 futuro get " + result2.get());
    System.out.println("Resultado tarea 3 futuro get " + result3.get());
    System.out.println("Continuamos");
    System.out.println("Resultado futuro isDone después del get " + result.isDone());

  }
}
