package th.rivera.hilos.ejemplos;

import th.rivera.hilos.ejemplos.runnable.ImprimirFrases;

public class SincronizacionThreadEjemplo {
  public static void main(String[] args) throws InterruptedException {
    new Thread(new ImprimirFrases("Hola", "que tal")).start();
    new Thread(new ImprimirFrases("¿Quien eres", "tu?")).start();
    Thread.sleep(100);
    Thread th3 = new Thread(new ImprimirFrases("Ahora es", "mi turno"));
    th3.start();
    Thread.sleep(100); //Para asegurar que ya paso el estado "RUNNABLE"
    System.out.println("Estado del hilo 3: " + th3.getState());

  }

  //Sincronización de hilos "synchronized", hasta que el hilo que está haciendo uso termine entra el otro
  public synchronized static void printSentences(String sentence1, String sentence2) {
    System.out.print(sentence1);
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(" " + sentence2);
  }
}
