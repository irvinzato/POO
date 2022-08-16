package th.rivera.hilos.ejemplos.threads;

public class NombreThread extends Thread{
  //Constructor opcional para darle otro nombre
  public NombreThread(String name) {
    super(name);
  }
  //Método que ejecutan los hilos, al dar "start()"
  @Override
  public void run() {
    System.out.println("Se inicia el método run del hilo " + getName());
    for( int i = 0; i < 10; i++ ) {
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println( this.getName() );
    }
    System.out.println("finaliza el hilo " + getName());
  }
}
