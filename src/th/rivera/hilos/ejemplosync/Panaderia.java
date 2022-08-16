package th.rivera.hilos.ejemplosync;

public class Panaderia {
  private String bread;
  private boolean available = false;

  public synchronized void bake(String dough) { //"hornear(String masa)"
    while( available ) { //Cuando este disponible queda en espera
      try {
        wait(); //"wait" y "notify" no se pueden usar sin el "synchronized" van de la mano
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    this.bread = dough;
    System.out.println("El panadero esta horneando: " + this.bread);
    this.available = true;
    notify(); //Para avisar que el producto está listo
  }

  public synchronized String consumeBread() {
    while( available == false ) {
      try {
        wait(); //"wait" y "notify" no se pueden usar sin el "synchronized" van de la mano
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("Cliente consume: " + this.bread);
    this.available = false;
    notify(); //Se avisa que se consumió tal pan
    return this.bread;
  }
}
