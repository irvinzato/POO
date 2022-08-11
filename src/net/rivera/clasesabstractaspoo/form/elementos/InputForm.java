package net.rivera.clasesabstractaspoo.form.elementos;

public class InputForm extends ElementoForm{
  //Como hereda de una clase abstracta debe implementar el método abstracto del padre
  private String type = "text";

  public InputForm(String name) {
    super(name);
  }

  public InputForm(String name, String type) {
    super(name);
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String drawHtml() {
    return "<input type='" + this.type +
            "' name='" + this.name +
            "' value='" + this.value +
            "'>";
  }
}
