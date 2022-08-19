package pfd.rivera.java8.datetime.ejemplos;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationEjemplo {
  public static void main(String[] args) {
    System.out.println("Calcular tiempo que pasa entre dos fechas");
    LocalDateTime date1 = LocalDateTime.now();
    LocalDateTime date2 = LocalDateTime.now().plusHours(3).plusMinutes(20).plusDays(1);

    Duration lapsus = Duration.between( date1, date2 );
    System.out.println("Duración entre primer y segunda fecha: " + lapsus);
    System.out.println("Duración en segundos: " + lapsus.getSeconds());
    System.out.println("Duración en dias: " + lapsus.toDays());
    System.out.println("Duración en horas+: " + lapsus.toHours());
    System.out.println("Duración en minutos: " + lapsus.toMinutes());

    System.out.println("Duración entre fechas mas 5 horas: " + lapsus.plusHours(5));

    //También tengo los width con LocalDateTime
    date1 = date1.withMonth(10);
    System.out.println("Fecha 1 modificada con withMonth: " + date1);

  }
}
