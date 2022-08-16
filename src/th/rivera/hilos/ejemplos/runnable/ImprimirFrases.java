package th.rivera.hilos.ejemplos.runnable;

import static th.rivera.hilos.ejemplos.SincronizacionThreadEjemplo.printSentences;

public class ImprimirFrases implements Runnable{
  private String sentence1, sentence2;

  public ImprimirFrases(String sentence1, String sentence2) {
    this.sentence1 = sentence1;
    this.sentence2 = sentence2;
  }

  @Override
  public void run() {
    //Mando a llamar método de clase "SincronizacionThreadEjemplo" e importo el método para disminuir aquí
    printSentences(this.sentence1, this.sentence2);
  }
}
