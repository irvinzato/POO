package net.rivera.clasesabstractaspoo.form.elementos;

import net.rivera.clasesabstractaspoo.form.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {
  //"protected" porque la idea es que las clases hijas puedan utilizar los atributos sin usar "get"
  protected String name;
  protected String value;

  private List<Validador> validators;
  private List<String> errors;

  public ElementoForm() {
    this.validators = new ArrayList<>();
    this.errors = new ArrayList<>();
  }

  public ElementoForm(String name) {
    this();
    this.name = name;
  }
  //Retorno la misma clase para poder usar la forma encadenada de métodos
  public ElementoForm addValidator(Validador validator) {
    this.validators.add(validator);
    return this;
  }

  public List<String> getErrors() {
    return this.errors;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public boolean isValid() {
    for( Validador v: validators ) {
      if( !v.isValid(this.value) ){
        this.errors.add(v.getMessage());
      }
    }
    return this.errors.isEmpty();
  }

  //Un método abstracto no puede tener implementación, las clases hijas lo implementan a su manera
  abstract public String drawHtml();

}
