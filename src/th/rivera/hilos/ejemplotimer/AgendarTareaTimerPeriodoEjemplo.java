package th.rivera.hilos.ejemplotimer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class AgendarTareaTimerPeriodoEjemplo {
  public static void main(String[] args) {
    //AtomicInteger counterAtomic = new AtomicInteger(3); //Usaría "counterAtomic.getAndDecrement()" para obtener el valor y decrementarlo
    Toolkit toolkit = Toolkit.getDefaultToolkit(); //Un plus para emitir sonido
    //Se realizara de forma periódica
    Timer timer = new Timer();
    timer.schedule(new TimerTask() {
      private int counter = 3; //Si no es atributo de la clase, no lo puede leer. Otra solución es hacerlo "AtomicInteger"
      @Override
      public void run() {
        //int i = counterAtomic.getAndDecrement();
        if( counter > 0 ) {
          toolkit.beep(); //Para generar sonido típico de windows
          System.out.println("Tarea " + counter + " periódica en: " + new Date() + " nombre del hilo: "
                  + Thread.currentThread().getName());
          counter--;
        } else {
          System.out.println("Finaliza el tiempo");
          timer.cancel(); //Se debe ser cuidadoso en su uso porque se podría salir en la primera ejecución
        }
      }
    }, 3000, 10000); //Se agrega nuevo parámetro, el cual dice cada cuanto se va a repetir

    System.out.println("Agendamos una tarea para 3 segundos más...");

  }
}
