package ru.rivera.interfacespoo.imprenta.modelo;

public class Informe extends Hoja implements Imprimible{
  private Persona author;
  private Persona reviewer;

  public Informe(String content, Persona author, Persona reviewer) {
    super(content);
    this.author = author;
    this.reviewer = reviewer;
  }

  @Override
  public String toPrint() {
    return "Informe escrito por: " + this.author +
            "\nRevisado por: " + this.reviewer +
            "\n" + this.content;
  }
}
