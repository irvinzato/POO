package th.rivera.hilos.ejemploexecutor;

import th.rivera.hilos.ejemplosync.Panaderia;
import th.rivera.hilos.ejemplosync.runnable.Consumidor;
import th.rivera.hilos.ejemplosync.runnable.Panadero;

import java.util.concurrent.*;

public class ExecutorProductorConsumidorEjemplo {
  public static void main(String[] args) throws InterruptedException, ExecutionException {

    ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

    System.out.println("Tamaño del Pool: " + executor.getPoolSize());
    System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());

    Panaderia p = new Panaderia();
    Runnable producer = new Panadero(p);
    Runnable consumer = new Consumidor(p);

    //Ejecuta los métodos "run()" de cada objeto
    Future<?> result = executor.submit(producer);
    Future<?> result2 = executor.submit(consumer);

    System.out.println("Tamaño del Pool: " + executor.getPoolSize());
    System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size()); //Después de agregar tareas al ejecutor

    executor.shutdown();
    System.out.println("Continuando con ejecución del método MAIN");


  }
}
