package pfd.rivera.java8.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Period;

public class PeriodEjemplo {
  public static void main(String[] args) {
    System.out.println("Periodo de tiempo entre fechas, sin el Time");
    LocalDate date1 = LocalDate.of(2022, 6, 20);
    LocalDate date2 = LocalDate.of(2021, 5, 10);

    Period period = Period.between(date1, date2);
    System.out.println("Periodo de tiempo entre fechas: " + period);

    System.out.printf("Periodo entre %s y %s hay %d años, %d meses y %d dias",
            date1, date2, period.getYears(), period.getMonths(), period.getDays());

    System.out.println("withMonth es inmutable, regresa una nueva instancia, se debe asignar");
    LocalDate date3 = date2.withMonth(8);
    System.out.println("Fecha modificada con withMonth: " + date3);
    date3 = date3.withDayOfMonth(25);
    System.out.println("Asigno a la misma fecha 3 un cambio: " + date3);

  }
}
