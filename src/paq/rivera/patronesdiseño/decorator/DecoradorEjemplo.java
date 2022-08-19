package paq.rivera.patronesdiseño.decorator;

import paq.rivera.patronesdiseño.decorator.decorador.MayusculasDecorador;
import paq.rivera.patronesdiseño.decorator.decorador.ReversaDecorador;
import paq.rivera.patronesdiseño.decorator.decorador.SubrayadoDecorador;

public class DecoradorEjemplo {
  public static void main(String[] args) {

    System.out.println("Patron Decorador - De forma recursiva se empieza a formatear el texto");
    System.out.println("Patron Decorador - Da posibilidades de tener muchas combinaciones posibles");
    System.out.println("Si se ocupara solo Herencia serian demasiadas combinaciones");

    Formateable text1 = new Texto("Hola Irving, aprende JAVA");
    System.out.println("texto constructor Texto: " + text1.format());

    MayusculasDecorador capitalLetter = new MayusculasDecorador(text1);
    ReversaDecorador reverseWord = new ReversaDecorador(capitalLetter);
    SubrayadoDecorador underline = new SubrayadoDecorador(reverseWord);

    System.out.println(underline.format());

  }
}
