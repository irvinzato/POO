package pfa.rivera.anotaciones.ejemplo.models;

import pfa.rivera.anotaciones.ejemplo.Init;
import pfa.rivera.anotaciones.ejemplo.JsonAtributo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Producto {
  //Cada atributo que anoto se va a importar a "JsonAtributo" y se necesita implementar un procesador para que tenga efecto
  @JsonAtributo  //(capitalize = true), también puedo poner () y es lo mismo a no tenerlos
  private String name;

  @JsonAtributo(nameAn = "costo") //Puedo darle un valor por defecto o no
  private Long price;

  private LocalDate date;

  @Init
  private void initProduct() {
    this.name = Arrays.stream( this.name.split(" ") )
                    .map( pal -> pal.substring(0, 1).toUpperCase() + pal.substring(1).toLowerCase() )
                    .collect(Collectors.joining(" "));
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }
}
