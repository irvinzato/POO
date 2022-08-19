package paq.rivera.patronesdiseño.abstractfactory.fabrica;

import paq.rivera.patronesdiseño.abstractfactory.PizzaProductoAbstract;
import paq.rivera.patronesdiseño.abstractfactory.PizzeriaZonaAbstractFactory;
import paq.rivera.patronesdiseño.abstractfactory.producto.*;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory {

  @Override
  public PizzaProductoAbstract createPizza(String type) {
    PizzaProductoAbstract product = null;
    switch(type) {
      case "peperoni":
        product = new PizzaCaliforniaPeperoni();
        break;
      case "queso":
        product = new PizzaCaliforniaQueso();
        break;
      case "vegetariana":
        product = new PizzaCaliforniaVegetariana();
        break;
    }
    return product;
  }

}
