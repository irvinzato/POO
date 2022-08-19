package paq.rivera.patronesdiseño.decoratorcafeejemplo.decorador;

import paq.rivera.patronesdiseño.decoratorcafeejemplo.Configurable;

public class ConChocolateDecorador extends CafeDecorador{

  public ConChocolateDecorador(Configurable coffee) {
    super(coffee);
  }

  //Por cada llamada va sumando lo que tenia mas el valor dado
  @Override
  public float getPriceBase() {
    return coffee.getPriceBase() + 5f;
  }

  @Override
  public String getIngredients() {
    return coffee.getIngredients() + ", chocolate";
  }
}
