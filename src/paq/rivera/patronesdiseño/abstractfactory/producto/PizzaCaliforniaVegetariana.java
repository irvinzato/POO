package paq.rivera.patronesdiseño.abstractfactory.producto;

import paq.rivera.patronesdiseño.abstractfactory.PizzaProductoAbstract;

public class PizzaCaliforniaVegetariana extends PizzaProductoAbstract {

  public PizzaCaliforniaVegetariana() {
    super();
    name = "Vegetariana de California";
    dough = "Masa delgada";
    sauce = "Salsa de tomate";
    ingredients.add("Hongos");
    ingredients.add("Cebolla");
    ingredients.add("Pimienta");
    ingredients.add("Queso Mozzarella");
    ingredients.add("Espinacas");
  }

  @Override
  public void cook() {
    System.out.println("Cocinando por 20 minutos a 170°C");
  }

  @Override
  public void cut() {
    System.out.println("Cortando pizza en rebanadas rectangulares");
  }
}
