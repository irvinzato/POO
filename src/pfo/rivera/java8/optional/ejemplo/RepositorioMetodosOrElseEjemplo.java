package pfo.rivera.java8.optional.ejemplo;

import pfo.rivera.java8.optional.ejemplo.models.Computadora;
import pfo.rivera.java8.optional.ejemplo.repositorio.ComputadoraRepositorio;
import pfo.rivera.java8.optional.ejemplo.repositorio.Repositorio;

public class RepositorioMetodosOrElseEjemplo {
  public static void main(String[] args) {
    System.out.println("orElse si no encuentra el valor, pasa uno por defecto");
    System.out.println("orElseGet es mucho mejor que orElse. Está mucho mejor optimizado");

    Repositorio<Computadora> cr = new ComputadoraRepositorio();

    //Computadora defect = new Computadora("HP Omen", "LI12");
    Computadora pc = cr.filterComp("Asus").orElse( valueDefect()  );
    System.out.println("orElse retorno: " + pc);

    System.out.println("En orElseGet no se pasa el objeto por defecto, se pasa una expresión lambda que retorna un objeto");
    pc = cr.filterComp("Mac").orElseGet( () -> valueDefect() );

    System.out.println("orElseGet retorno: " + pc);

  }

  //En el "orElse" siempre manda a llamar este método aun que encuentre el objeto buscado
  public static Computadora valueDefect() {
    System.out.println("Obteniendo valor del método por defecto");
    return new Computadora("HP Omen", "LI12");
  }

}
