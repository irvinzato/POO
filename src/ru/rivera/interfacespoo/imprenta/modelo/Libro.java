package ru.rivera.interfacespoo.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{
  private List<Imprimible> pages;
  private String author;
  private String titule;
  private Genero type;

  public Libro(String author, String titule, Genero type) {
    this.author = author;
    this.titule = titule;
    this.type = type;
    this.pages = new ArrayList<>();
  }
  //Como Pagina hereda de Hoja, también puede usar los métodos que reciben "Hoja"
  public Libro addPage(Imprimible pag) {
    pages.add(pag);
    return this;
  }

  @Override
  public String toPrint() {
    StringBuilder sb = new StringBuilder("Titulo: ");
    sb.append(this.titule).append("\n")
      .append("Autor: ").append(this.author).append("\n")
      .append("Genero: ").append(this.type).append("\n")
      .append("Hojas: \n");
    for(Imprimible pag: pages) {
      sb.append("- ").append(pag.toPrint()).append("\n");
    }
    return sb.toString();
  }
}
