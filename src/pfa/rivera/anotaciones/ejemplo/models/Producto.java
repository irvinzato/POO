package pfa.rivera.anotaciones.ejemplo.models;

import pfa.rivera.anotaciones.ejemplo.JsonAtributo;

import java.time.LocalDate;

public class Producto {
  //Cada atributo que anoto se va a importar a "JsonAtributo" y se necesita implementar un procesador para que tenga efecto
  @JsonAtributo
  private String name;

  @JsonAtributo(nameAn = "costo") //Puedo darle un valor por defecto o no
  private Long price;

  private LocalDate date;

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
