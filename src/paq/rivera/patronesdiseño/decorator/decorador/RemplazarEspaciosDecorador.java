package paq.rivera.patronesdiseño.decorator.decorador;

import paq.rivera.patronesdiseño.decorator.Formateable;

public class RemplazarEspaciosDecorador extends TextoDecorador{

  public RemplazarEspaciosDecorador(Formateable textFormat) {
    super(textFormat);
  }

  @Override
  public String format() {
    return textFormat.format().replace(" ", "_");
  }
}
