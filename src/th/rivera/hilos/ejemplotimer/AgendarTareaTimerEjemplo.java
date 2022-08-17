package th.rivera.hilos.ejemplotimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class AgendarTareaTimerEjemplo {
  public static void main(String[] args) {
    Timer timer = new Timer();
    //"timer" tiene mucha sobre carga de métodos
    timer.schedule(new TimerTask() {
      @Override
      public void run() {
        System.out.println("Tarea realizad en: " + new Date() + " nombre del hilo: "
        + Thread.currentThread().getName());
        System.out.println("Finaliza el tiempo");
        timer.cancel(); //Como ya no lo usaré, se finaliza
      }
    }, 5000);

    System.out.println("Agendamos una tarea para 5 segundos más...");

  }
}
