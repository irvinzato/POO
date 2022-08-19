package pfa.rivera.anotaciones.ejemplo;

import pfa.rivera.anotaciones.ejemplo.models.Producto;
import pfa.rivera.anotaciones.ejemplo.procesador.JsonSerializador;

import java.time.LocalDate;


public class AnotacionSerializadoEjemplo {
  public static void main(String[] args) {

    Producto p = new Producto();
    p.setDate(LocalDate.now());
    p.setName("Mesa de centro roble");
    p.setPrice(1500L);

    String json = JsonSerializador.convertJSON(p);
    System.out.println("JSON generado: " + json );


  }
}
