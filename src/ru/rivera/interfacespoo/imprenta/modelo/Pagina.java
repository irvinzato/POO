package ru.rivera.interfacespoo.imprenta.modelo;

public class Pagina extends Hoja implements Imprimible{

  public Pagina(String content) {
    super(content);
  }

  @Override
  public String toPrint() {
    return this.content;
  }
}
