package paq.rivera.patronesdiseño.abstractfactory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProducto {
  protected String name;
  protected String dough;
  protected String sauce;
  protected List<String> ingredients;

  public PizzaProducto() {
    this.ingredients = new ArrayList<>();
  }

  public void preparete() {
    System.out.println("Preparando: " + name);
    System.out.println("Seleccionando masa: " + dough);
    System.out.println("Agregando salsa: " + sauce);
    System.out.println("Agregando ingredientes: ");
    ingredients.forEach(System.out::println);
  }

  public void packPizza() {
    System.out.println("Pizza empaquetada en caja de empaque");
  }

  //Métodos abstractos para que cada uno implemente su forma de hacerlo
  abstract public void cook();
  abstract public void cut();

  @Override
  public String toString() {
    return "PizzaProducto{" +
            "name='" + name + '\'' +
            ", dough='" + dough + '\'' +
            ", sauce='" + sauce + '\'' +
            ", ingredients=" + ingredients +
            '}';
  }
}
