package paq.rivera.patronesdiseño.abstractfactory.producto;

import paq.rivera.patronesdiseño.abstractfactory.PizzaProductoAbstract;

public class PizzaCaliforniaQueso extends PizzaProductoAbstract {

  public PizzaCaliforniaQueso() {
    super();
    name = "California a los Quesos";
    dough = "Masa a la Edgar";
    sauce = "Salsa BBQ";
    ingredients.add("Queso Mozzarella");
    ingredients.add("Queso Manchego");
    ingredients.add("Queso azul");
  }

  @Override
  public void cook() {
    System.out.println("Cocinando por 35 minutos a 110°C");
  }

  @Override
  public void cut() {
    System.out.println("Cortando en cuadrados");
  }
}
