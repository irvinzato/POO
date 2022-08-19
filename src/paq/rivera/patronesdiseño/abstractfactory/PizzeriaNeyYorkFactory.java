package paq.rivera.patronesdiseño.abstractfactory;

import paq.rivera.patronesdiseño.abstractfactory.producto.PizzaNewYorkItaliana;
import paq.rivera.patronesdiseño.abstractfactory.producto.PizzaNewYorkPeperoni;
import paq.rivera.patronesdiseño.abstractfactory.producto.PizzaNewYorkVegetariana;

//Clase concreta que va a empezar a crear su pizza
public class PizzeriaNeyYorkFactory extends PizzeriaZonaAbstractFactory{

  @Override
  PizzaProductoAbstract createPizza(String type) {
    PizzaProductoAbstract product = null;
    switch (type){
      case "vegetariana":
        product = new PizzaNewYorkVegetariana();
        break;
      case  "peperoni":
        product = new PizzaNewYorkPeperoni();
        break;
      case "italiana":
        product = new PizzaNewYorkItaliana();
        break;
    }
    return product;
  }


}
