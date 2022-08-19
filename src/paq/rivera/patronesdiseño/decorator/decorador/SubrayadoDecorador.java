package paq.rivera.patronesdiseño.decorator.decorador;

import paq.rivera.patronesdiseño.decorator.Formateable;

public class SubrayadoDecorador extends TextoDecorador{
  public SubrayadoDecorador(Formateable textFormat) {
    super(textFormat);
  }

  @Override
  public String format() {
    int large = textFormat.format().length();
    StringBuilder sb = new StringBuilder(textFormat.format());
    sb.append("\n");
    for( int i = 0; i < large; i++ ) {
      sb.append("_");
    }
    return sb.toString();
  }
}
