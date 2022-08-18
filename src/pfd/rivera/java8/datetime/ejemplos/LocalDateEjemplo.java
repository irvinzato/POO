package pfd.rivera.java8.datetime.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalDateEjemplo {
  public static void main(String[] args) {
    //Está API no ocupa el "new"
    LocalDate currentDate = LocalDate.now();
    System.out.println("Fecha de hoy: " + currentDate);
    System.out.println("Dia: " + currentDate.getDayOfMonth());
    System.out.println("Dia del anio: " + currentDate.getDayOfYear());
    System.out.println("Mes: " + currentDate.getMonth());
    System.out.println("Anio: " + currentDate.getYear());
    System.out.println("Era: " + currentDate.getEra());

    currentDate = LocalDate.of(2022, 1, 2);
    System.out.println("Fecha actual modificada con of 1: " + currentDate);

    currentDate = LocalDate.of(2022, Month.APRIL, 30);
    System.out.println("Otra forma de modificarla con of 2: " + currentDate);

    currentDate = LocalDate.parse("2022-06-20");
    System.out.println("Otra más, con parse: " + currentDate);

    LocalDate tomorrow = LocalDate.now().plusDays(1);
    System.out.println("Dia de mañana: " + tomorrow);

    LocalDate previousMonthSameDay = LocalDate.now().minusMonths(1); //También funciona "minus(1, ChronoUnit.MONTHS)"
    System.out.println("Mes anterios, mismo dia: " + previousMonthSameDay);

    DayOfWeek thursday = LocalDate.parse("2022-08-18").getDayOfWeek();
    System.out.println("Dia de la semana: " + thursday);

    int dayNum = LocalDate.of(2022, 8, 18).getDayOfMonth();
    System.out.println("Numero del dia: " + dayNum);

    boolean leapYear = LocalDate.now().isLeapYear();
    System.out.println("¿Es año bisiesto? " + leapYear);

    //con "now()" comparo la fecha de hoy, con "of()" le puedo dar la fecha que quiera al comparar
    boolean isBefore = LocalDate.now().isBefore(LocalDate.parse("2022-08-19"));
    System.out.println("¿Es una fecha anterior? " + isBefore);

    boolean isAfter = LocalDate.parse("2022-09-20").isAfter(LocalDate.parse("2022-08-18"));
    System.out.println("¿Es una fecha despues? " + isAfter);

    isAfter = LocalDate.now().isAfter(LocalDate.now().minusDays(1));
    System.out.println("Otra comparación de si es después: " + isAfter);


    System.out.println("MES EN ESPANIOL, DIA Y VARIEDADES");
    LocalDate currentDate2 = LocalDate.now();
    Month mounth = currentDate2.getMonth();
    System.out.println("Mes: " + mounth);
    System.out.println("Numero del mes: " + mounth.getValue());
    System.out.println("Mes en Espaniol: " + mounth.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

    DayOfWeek dayOfWeek = currentDate2.getDayOfWeek();
    System.out.println("Numero del dia: " +dayOfWeek.getValue());
    System.out.println("Nombre del dia: " +dayOfWeek.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

  }
}
