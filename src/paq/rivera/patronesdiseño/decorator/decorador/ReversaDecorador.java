package paq.rivera.patronesdiseño.decorator.decorador;

import paq.rivera.patronesdiseño.decorator.Formateable;

//hijo
public class ReversaDecorador extends TextoDecorador{

  public ReversaDecorador(Formateable textFormat) {
    super(textFormat);
  }

  @Override
  public String format() {
    StringBuilder sb = new StringBuilder(textFormat.format()); //Tomo el texto original en SB y lo devuelvo como string
    return sb.reverse().toString();
  }
}
