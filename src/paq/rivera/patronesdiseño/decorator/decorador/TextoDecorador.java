package paq.rivera.patronesdiseño.decorator.decorador;

import paq.rivera.patronesdiseño.decorator.Formateable;
//Decorador padre
abstract public class TextoDecorador implements Formateable {

  protected Formateable textFormat;

  public TextoDecorador(Formateable textFormat) {
    this.textFormat = textFormat;
  }
}
