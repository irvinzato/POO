package th.rivera.hilos.ejemplos;

import th.rivera.hilos.ejemplos.runnable.ViajeTarea;

public class InterfaceRunnableEjemplo {
  public static void main(String[] args) {
    //Una manera de crearlo y ejecutarlo en la misma línea
    new Thread(new ViajeTarea("Tulum")).start();
    new Thread(new ViajeTarea("Yucatan")).start();
    new Thread(new ViajeTarea("Inglaterra")).start();
    new Thread(new ViajeTarea("Machu Pichu")).start();


  }
}