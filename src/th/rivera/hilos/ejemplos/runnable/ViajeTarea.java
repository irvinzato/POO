package th.rivera.hilos.ejemplos.runnable;

//Similar al "Thread" pero usando interfaz, puede ser mejor porque deja libre "extends"
public class ViajeTarea implements Runnable{
  private String name;

  public ViajeTarea(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  //Método que implementa la tarea del hilo, igual que en "Thread"
  @Override
  public void run() {
    for( int i = 0; i < 10; i++ ) {
      System.out.println(i + " - " + this.name);
      try {
        Thread.sleep((long)(Math.random() * 2000) ); //Solo para dar una pausa en la ejecución
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("Finalmente me voy de viaje a " + this.name);
  }
}
