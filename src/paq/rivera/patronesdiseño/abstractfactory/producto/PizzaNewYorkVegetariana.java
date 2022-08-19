package paq.rivera.patronesdiseño.abstractfactory.producto;

import paq.rivera.patronesdiseño.abstractfactory.PizzaProductoAbstract;

//Clase concreta, como se crea una Pizza vegetarian en New York
public class PizzaNewYorkVegetariana extends PizzaProductoAbstract {

  public PizzaNewYorkVegetariana() {
    super();      //Para tener la lista de ingredientes que tiene el padre
    name = "Vegetariana New Yorkina";
    dough = "Integral vegana";
    sauce = "De tomate";
    ingredients.add("Queso vegano");
    ingredients.add("Champiñones");
    ingredients.add("Aceitunas");
    ingredients.add("Piña");
    ingredients.add("Espinacas");
    ingredients.add("Berenjenas");
  }

  @Override
  public void cook() {
    System.out.println("Cocinando por 25 minutos a 150°C");
  }

  @Override
  public void cut() {
    System.out.println("Cortando pizza en rebanadas triangulares");
  }

}
