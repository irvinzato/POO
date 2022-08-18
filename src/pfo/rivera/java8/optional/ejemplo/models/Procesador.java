package pfo.rivera.java8.optional.ejemplo.models;

public class Procesador {
  private String name;
  private Fabricante maker;

  public Procesador(String name, Fabricante maker) {
    this.name = name;
    this.maker = maker;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Fabricante getMaker() {
    return maker;
  }

  public void setMaker(Fabricante maker) {
    this.maker = maker;
  }
}
