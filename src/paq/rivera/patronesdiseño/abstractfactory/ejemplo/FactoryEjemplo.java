package paq.rivera.patronesdiseño.abstractfactory.ejemplo;

import paq.rivera.patronesdiseño.abstractfactory.PizzaProductoAbstract;
import paq.rivera.patronesdiseño.abstractfactory.PizzeriaZonaAbstractFactory;
import paq.rivera.patronesdiseño.abstractfactory.fabrica.PizzeriaCaliforniaFactory;
import paq.rivera.patronesdiseño.abstractfactory.fabrica.PizzeriaNeyYorkFactory;

public class FactoryEjemplo {
  public static void main(String[] args) {
    System.out.println("Patrón de diseño abstract factory - Familias de objetos relacionados en una jerarquía");

    //Siempre es mejor usar la clase más abstracta
    PizzeriaZonaAbstractFactory pizzaCalifornia = new PizzeriaCaliforniaFactory();
    PizzeriaZonaAbstractFactory pizzaNY = new PizzeriaNeyYorkFactory();


    System.out.println("------- PRIMER PEDIDO -------");
    PizzaProductoAbstract pizzaOrder1 = pizzaCalifornia.orderPizza("vegetariana");
    System.out.println("Cliente 23, ordeno pizza: " + pizzaOrder1.getName());

    System.out.println("------- SEGUNDO PEDIDO -------");
    PizzaProductoAbstract pizzaOrder2 = pizzaNY.orderPizza("vegetariana");
    System.out.println("Cliente 26, ordeno pizza: " + pizzaOrder2.getName());

    System.out.println("------- TERCER PEDIDO -------");
    pizzaOrder2 = pizzaNY.orderPizza("italiana");
    System.out.println("Cliente 27, ordeno pizza: " + pizzaOrder2.getName());
    System.out.println("toString: " + pizzaOrder2);





  }
}
