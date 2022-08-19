package paq.rivera.patronesdiseño.decoratorcafeejemplo.decorador;

import paq.rivera.patronesdiseño.decoratorcafeejemplo.Configurable;

public class ConCremaDecorador extends CafeDecorador{

  public ConCremaDecorador(Configurable coffee) {
    super(coffee);
  }

  @Override
  public float getPriceBase() {
    return coffee.getPriceBase() + 2.5f;
  }

  @Override
  public String getIngredients() {
    return coffee.getIngredients() + ", Crema";
  }
}
