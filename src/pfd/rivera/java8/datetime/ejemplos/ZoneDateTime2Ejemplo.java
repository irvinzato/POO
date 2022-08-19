package pfd.rivera.java8.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class ZoneDateTime2Ejemplo {
  public static void main(String[] args) {
    System.out.println("SEGUNDA PARTE DE ZONAS HORARIAS - VIAJE FUTURO");
    //Importante el estándar de fecha "2022-08-24T12:45" o como segundo parámetro se lo puedo definir
    LocalDateTime dateLocal = LocalDateTime.parse("2022/08/24 12:45",
                                                  DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));

    ZoneId mexico = ZoneId.of("GMT-5");
    ZonedDateTime zoneMX = ZonedDateTime.of(dateLocal, mexico);
    //ZonedDateTime zoneMX = dateLocal.atZone(mexico); //Otra forma, mismo resultado que la forma de arriba
    System.out.println("Zona horaria de Mexico: " + zoneMX );

    ZoneId madrid = ZoneId.of("Europe/Madrid");
    ZonedDateTime zoneMAD = zoneMX.withZoneSameInstant(madrid).plusHours(9);
    System.out.println("Zona horaria de Madrid: " + zoneMAD);

    DateTimeFormatter df = DateTimeFormatter.ofPattern("HHmm, dd MM yyyy");
    System.out.println("Detalles del vuelo a España: ");
    System.out.println("Partida MX: " + df.format(zoneMX));
    System.out.println("Llegada Madrid: " + df.format(zoneMAD));

    System.out.println("Uso de ZoneOffset en lugar del ZoneId, mismo resultado pero sin Zona horaria");
    zoneMX = ZonedDateTime.of(dateLocal, ZoneOffset.of("-05:00"));
    zoneMAD = zoneMX.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(9);
    System.out.println(zoneMX);
    System.out.println(zoneMAD);

    System.out.println("Zonas con getAvailableZoneIds - SON VARIAS");
    Set<String> zones = ZoneId.getAvailableZoneIds();
    zones.forEach(System.out::println);


  }
}
