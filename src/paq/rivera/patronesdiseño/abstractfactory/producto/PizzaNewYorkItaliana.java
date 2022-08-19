package paq.rivera.patronesdiseño.abstractfactory.producto;

import paq.rivera.patronesdiseño.abstractfactory.PizzaProductoAbstract;

public class PizzaNewYorkItaliana extends PizzaProductoAbstract {

  public PizzaNewYorkItaliana() {
    super();
    name = "Italiana New Yorkina";
    dough = "Masa gruesa";
    sauce = "Salsa de tomate italiano con carne";
    ingredients.add("Queso Mozzarella");
    ingredients.add("Champiñones");
    ingredients.add("Jamón");
    ingredients.add("Chorizo");
  }

  @Override
  public void cook() {
    System.out.println("Cocinando por 40 minutos a 100°C");
  }

  @Override
  public void cut() {
    System.out.println("Cortando pizza en triángulos grandes");
  }
}
