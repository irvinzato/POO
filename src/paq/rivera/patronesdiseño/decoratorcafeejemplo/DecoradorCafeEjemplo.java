package paq.rivera.patronesdiseño.decoratorcafeejemplo;

import paq.rivera.patronesdiseño.decoratorcafeejemplo.decorador.ConChocolateDecorador;
import paq.rivera.patronesdiseño.decoratorcafeejemplo.decorador.ConCremaDecorador;
import paq.rivera.patronesdiseño.decoratorcafeejemplo.decorador.ConLecheDecorador;

public class DecoradorCafeEjemplo {
  public static void main(String[] args) {

    Configurable coffee1 = new Cafe(7, "Cafe Mocha");
    ConCremaDecorador withCream = new ConCremaDecorador(coffee1); //Decoro el cafe1
    ConLecheDecorador withMilk = new ConLecheDecorador(withCream); //Lo vuelvo a decorar
    ConChocolateDecorador whitChocolate = new ConChocolateDecorador(withMilk);

    System.out.println("Precio del primer café preparado: " + whitChocolate.getPriceBase());
    System.out.println("Ingredientes del café preparado: " + whitChocolate.getIngredients());

    Configurable capuchino = new Cafe(7, "Cafe Capuchino");
    withCream = new ConCremaDecorador(capuchino);
    withMilk = new ConLecheDecorador(withCream);

    System.out.println("Precio del capuchino: " + withMilk.getPriceBase());
    System.out.println("Ingredientes del capuchino: " + withMilk.getIngredients());

    Configurable espresso = new Cafe(3, "Cafe Espresso");
    System.out.println("Precio del cafe espresso: " + espresso.getPriceBase());
    System.out.println("Ingredientes del cafe espresso: " + espresso.getIngredients());

  }
}
