package paq.rivera.patronesdiseño.abstractfactory.producto;

import paq.rivera.patronesdiseño.abstractfactory.PizzaProductoAbstract;

public class PizzaNewYorkPeperoni extends PizzaProductoAbstract {

  public PizzaNewYorkPeperoni() {
    super();
    name = "Peperoni New Yorkina";
    dough = "Masa delgada a la piedra";
    sauce = "Boloñesa";
    ingredients.add("Queso mozzarella");
    ingredients.add("Pimientos");
    ingredients.add("Aceitunas");
  }

  @Override
  public void cook() {
    System.out.println("Cocinado por 35 minutos a 135°C");
  }

  @Override
  public void cut() {
    System.out.println("Cortando pizza en cuadrados");
  }
}
