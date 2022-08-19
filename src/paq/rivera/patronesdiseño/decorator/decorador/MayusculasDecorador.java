package paq.rivera.patronesdiseño.decorator.decorador;

import paq.rivera.patronesdiseño.decorator.Formateable;

//hijo
public class MayusculasDecorador extends TextoDecorador{

  public MayusculasDecorador(Formateable textFormat) {
    super(textFormat);
  }

  @Override
  public String format() {
    return textFormat.format().toUpperCase();
  }
}
