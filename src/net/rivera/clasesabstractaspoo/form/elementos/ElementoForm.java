package net.rivera.clasesabstractaspoo.form.elementos;

abstract public class ElementoForm {
  //"protected" porque la idea es que las clases hijas puedan utilizar los atributos sin usar "get"
  protected String name;
  protected String value;

  public ElementoForm() {
  }

  public ElementoForm(String name) {
    this();
    this.name = name;
  }

  public void setValue(String value) {
    this.value = value;
  }

  //Un método abstracto no puede tener implementación, las clases hijas lo implementan a su manera
  abstract public String drawHtml();

}
