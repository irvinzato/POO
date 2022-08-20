package paq.rivera.patronesdiseño.composite;

public class Archivo extends Componente{

  public Archivo(String name) {
    super(name);
  }

  @Override
  public String show(int level) {
    return "\t".repeat(level) + name;
  }

  @Override
  public boolean search(String name) {
    return this.name.equalsIgnoreCase(name); //con this para diferencias nombré de la clase, con nombre de atributo
  }
}
