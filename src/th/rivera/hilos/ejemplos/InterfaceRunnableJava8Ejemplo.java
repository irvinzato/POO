package th.rivera.hilos.ejemplos;

public class InterfaceRunnableJava8Ejemplo {
  public static void main(String[] args) throws InterruptedException {
    Thread main = Thread.currentThread(); //Para obtener hilo principal
    //Creo en la misma clase, el método que van a implementar los hilos
    Runnable trip = new Runnable() {  //se puede cambiar a expresiones lambda
      @Override
      public void run() {
        for( int i = 0; i < 10; i++ ) {
          System.out.println(i + " - " + Thread.currentThread().getName()); //"Thread" tiene su propiedad "currentThread" para saber que hilo se está ejecutando
          try {
            Thread.sleep((long)(Math.random() * 2000) );
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        System.out.println("Finalmente me voy de viaje a " + Thread.currentThread().getName() );
        System.out.println("Estado de main: " + main.getState() );
      }
    };
    //El constructor permite pasarle una instancea de "Runnable" y el nombre del "Thread"
    Thread v1 = new Thread(trip, "Tulum");
    Thread v2 = new Thread(trip, "Yucatan");
    Thread v3 = new Thread(trip, "Inglaterra");
    Thread v4 = new Thread(trip, "Machu Pichu");
    v1.start();
    v2.start();
    v3.start();
    v4.start();

    //Join vs Sleep
    //Thread.sleep(10000);
    v1.join(); //"join()" hace que espere el hijo asignado para continuar con el procedimiento
    v2.join();
    v3.join();
    v4.join();
    System.out.println("Continuando con la ejecución del método main: " + main.getName());


  }
}
