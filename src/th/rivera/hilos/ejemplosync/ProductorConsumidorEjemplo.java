package th.rivera.hilos.ejemplosync;

import th.rivera.hilos.ejemplosync.runnable.Consumidor;
import th.rivera.hilos.ejemplosync.runnable.Panadero;

public class ProductorConsumidorEjemplo {
  public static void main(String[] args) {
    Panaderia p = new Panaderia();
    new Thread(new Panadero(p)).start();
    new Thread(new Consumidor(p)).start();


  }
}
