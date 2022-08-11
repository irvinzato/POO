package net.rivera.clasesabstractaspoo.form.elementos.select;

public class Opcion {
  private String name;
  private String value;
  private boolean selected;

  public Opcion() {
  }

  public Opcion(String name, String value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public boolean isSelected() {
    return selected;
  }

  public void setSelected(boolean selected) {
    this.selected = selected;
  }
}
