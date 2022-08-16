package th.rivera.hilos.ejemplos;

import th.rivera.hilos.ejemplos.threads.NombreThread;

public class ExtenderThreadEjemplo {
  public static void main(String[] args) throws InterruptedException {
    //Cada hilo corre en su propio procesador, de forma paralela
    Thread hilo = new NombreThread("hilo 1");
    Thread hilo2 = new NombreThread("hilo 2");
    NombreThread hilo3 = new NombreThread("hilo 3"); //Puedo usar la misma clase o su padre "Thread"
    hilo.start(); //El "start()" internamente invoca el método "run()", método que sobre escribí en clase "NombreThread"
    //Thread.sleep(100); //Lo use solo para ver como varía con una pequeña pausa el estado
    hilo2.start();
    hilo3.start();
    System.out.println("Estado del hilo 1: " + hilo.getState());
    System.out.println("Estado del hilo 2: " + hilo2.getState());
    System.out.println("Estado del hilo 3: " + hilo3.getState());



  }
}
