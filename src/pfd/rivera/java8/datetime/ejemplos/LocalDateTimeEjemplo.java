package pfd.rivera.java8.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEjemplo {
  public static void main(String[] args) {
    //Combinación de fecha y hora
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println("Fecha completa: " + dateTime);

    dateTime = LocalDateTime.of(2022, Month.DECEMBER, 24, 20, 45, 3);
    System.out.println("Otra forma de crear la fecha completa, con of: " + dateTime);

    dateTime = LocalDateTime.parse("2022-12-24T20:45:03");
    System.out.println("Fecha con parse: " + dateTime);

    System.out.println("Los métodos retornan una nueva instancia, no modifican solo al usarlos");
    System.out.println("Los mismo métodos que con una fecha o tiempo se pueden utilizar");
    LocalDateTime dateTimePlus = dateTime.plusDays(1).plusHours(4);
    System.out.println("Modifique con Plus: " + dateTimePlus);

    System.out.println("Modifique con Minus la primer fecha: " + dateTime.minusHours(3));

    Month month = dateTime.getMonth();
    System.out.println("Mes: " + month);

    int day = dateTime.getDayOfMonth();
    System.out.println("Dia: " + day);

    int anio = dateTime.getYear();
    System.out.println("anio: " + anio);

    System.out.println("------------- FORMATOS PARA FECHAS -------------");
    String format1 = dateTime.format(DateTimeFormatter.ISO_DATE);
    System.out.println("Formato de fechas estándar DateTimeFormatter.ISO_DATE: " + format1);

    String format2 = dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    System.out.println("Formato DateTimeFormatter.ISO_LOCAL_DATE_TIME: " + format2);

    System.out.println("FORMATO PERSONALIZADO DE FECHA");
    DateTimeFormatter formatPer = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); //"hh a" AM-PM
    String format3 = dateTime.format(formatPer);
    System.out.println("Personalizado con ofPattern: " + format3);

    //También puede ser al reves. Es el mismo resultado
    String format4 = formatPer.format(dateTime);
    System.out.println("Personalizado de manera inversa: " + format4);

  }
}
