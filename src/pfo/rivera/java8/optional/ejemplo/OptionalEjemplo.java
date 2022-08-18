package pfo.rivera.java8.optional.ejemplo;

import java.util.Optional;

public class OptionalEjemplo {
  public static void main(String[] args) {
    System.out.println("Un Optional se utiliza para representar que un valor este presente o ausente y evita cualquier lanzamiento de excepción NullPointerException");
    System.out.println("También es un contenedor en donde solo se puede guardar UN SOLO VALOR");

    String name = "Irving";
    Optional<String> opt = Optional.of(name); //Of cuando no habrá nulos, si no estamos seguros "ofNullable"
    System.out.println(opt);
    System.out.println(opt.isPresent());

    if( opt.isPresent() ) {
      System.out.println("Realizo alguna acción si esta presente " + opt.get());
    } else {
      System.out.println("Realizo otra cosa si no esta presente ");
    }
    //Muy similar al if de arriba pero con expresión lambda
    opt.ifPresent( value -> System.out.println("Que tal, " + value));
    System.out.println(opt.isEmpty());


    System.out.println("Optional nulo");
    name = null;
    opt = Optional.ofNullable(name);

    opt.ifPresentOrElse( value -> System.out.println("Que tal, " + value),
                        () -> System.out.println("No esta presente"));


    System.out.println("Opcional vacío");
    Optional<String> optEmpty = Optional.empty();
    System.out.println("optEmpty = " + optEmpty);
    System.out.println(optEmpty.isPresent());

  }
}
