package paq.rivera.patronesdiseño.decoratorcafeejemplo.decorador;

import paq.rivera.patronesdiseño.decoratorcafeejemplo.Configurable;

public class ConLecheDecorador extends CafeDecorador{

  public ConLecheDecorador(Configurable coffee) {
    super(coffee);
  }

  @Override
  public float getPriceBase() {
    return coffee.getPriceBase() + 2.7f;
  }

  @Override
  public String getIngredients() {
    return coffee.getIngredients() + ", Leche";
  }
}
