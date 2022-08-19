package pfd.rivera.java8.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeEjemplo {
  public static void main(String[] args) {
    System.out.println("Trabajo con Zonas Horarias");
    LocalDateTime dateLocal = LocalDateTime.now();

    ZoneId mexico = ZoneId.of("GMT-5"); //Buscar zona horaria para estar seguros
    ZonedDateTime zoneMX = ZonedDateTime.of(dateLocal, mexico);
    System.out.println("Zona horaria de Mexico: " + zoneMX );

    ZoneId madrid = ZoneId.of("Europe/Madrid");
    ZonedDateTime zoneMAD = zoneMX.withZoneSameInstant(madrid); //Método que a partir de una zona calcula otra
    System.out.println("Zona horaria de Madrid: " + zoneMAD);

    System.out.println("---------- CALCULO DE VUELO ----------");
    System.out.println("Hola de salida del vuelo desde México: " + zoneMX);
    ZonedDateTime zoneMADFly = zoneMX.withZoneSameInstant(madrid).plusHours(7);
    System.out.println("Hora de llegada del vuelo a Madrid: " + zoneMADFly);




  }
}
