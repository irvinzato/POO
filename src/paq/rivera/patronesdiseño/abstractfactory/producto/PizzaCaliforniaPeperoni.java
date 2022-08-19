package paq.rivera.patronesdiseño.abstractfactory.producto;

import paq.rivera.patronesdiseño.abstractfactory.PizzaProductoAbstract;

public class PizzaCaliforniaPeperoni extends PizzaProductoAbstract {

  public PizzaCaliforniaPeperoni() {
    super();
    name = "Peperoni a la California";
    dough = "Masa a la piedra";
    sauce = "Boloñesa";
    ingredients.add("Queso Moza");
    ingredients.add("Cebolla");
    ingredients.add("Pimienta");
    ingredients.add("Queso Oaxaca");
  }

  @Override
  public void cook() {
    System.out.println("Cocinando por 30 minutos a 130°C");
  }

  @Override
  public void cut() {
    System.out.println("Cortando en triángulos pequeños");
  }
}
