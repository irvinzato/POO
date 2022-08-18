package pfd.rivera.java8.datetime.ejemplos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalTimeEjemplo {
  public static void main(String[] args) {
    //Misma mecánica pero con Time(para el tiempo)
    LocalTime now = LocalTime.now();
    System.out.println("Tiempo(Hora reloj): " + now);
    System.out.println("Hora: " + now.getHour());
    System.out.println("Minutos: " + now.getMinute());
    System.out.println("Segundos: " + now.getSecond());
    System.out.println("Nano segundos: " + now.getNano());

    LocalTime sixThirty = LocalTime.of(6, 30, 59);
    System.out.println("Modificación de hora con of: " + sixThirty);

    sixThirty = LocalTime.parse("06:30"); //Formato 24 horas(Para las 6 de la tarde es 18)
    System.out.println("Modificación de hora con parse: " + sixThirty);

    LocalTime sevenThirty = LocalTime.of(6,30).plus(1, ChronoUnit.HOURS);
    System.out.println("Sumar al tiempo, en este caso una hora: " + sevenThirty);

    boolean isBefore = LocalTime.of(6, 30).isBefore(LocalTime.parse("07:30"));
    System.out.println("Comparar tiempos, isBefore: " + isBefore);


    System.out.println("---------- Uso de DateTimeFormatter ----------");
    System.out.println("Muy parecido a DateFormat pero ahora con LocalTime, también sirve con LocalTime");
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a"); //cuando es "HH" es formato 24 horas y no lleva la última "a"

    String nowFormat = now.format(dtf);
    System.out.println("Hora del localTime: " + now);
    System.out.println("Hora formateada: " + nowFormat);

    String sixThirtyFormat = sixThirty.format(dtf);
    System.out.println("Seis con treinta formateada: " + sixThirtyFormat);

    nowFormat = dtf.format(now);
    System.out.println("Otro formateo para la hora actual: " + nowFormat);

    LocalTime max = LocalTime.MAX;
    LocalTime min = LocalTime.MIN;
    System.out.println("Hora máxima de un dia: " + max);
    System.out.println("Hora minima de un dia: " + min);


  }
}
