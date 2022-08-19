package paq.rivera.patronesdiseño.abstractfactory;

abstract public class PizzeriaZonaAbstractFactory {

  public PizzaProductoAbstract orderPizza(String type){
    PizzaProductoAbstract pizza = createPizza(type);
    System.out.println("---- Fabricando pizza: " + pizza.getName() + " ----" );
    pizza.preparete();
    pizza.cook();
    pizza.cut();
    pizza.packPizza();
    return pizza;
  }

  //Cada pizzeria va a crear a su modo sus pizzas
   abstract public PizzaProductoAbstract createPizza(String type);


}
