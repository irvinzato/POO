package ru.rivera.interfacespoo.imprenta.modelo;

abstract public class Hoja {
  protected String content;

  public Hoja(String content) {
    this.content = content;
  }

  abstract public String toPrint();

}
