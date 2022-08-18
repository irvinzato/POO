package pfo.rivera.java8.optional.ejemplo;

import pfo.rivera.java8.optional.ejemplo.models.Computadora;
import pfo.rivera.java8.optional.ejemplo.repositorio.ComputadoraRepositorio;
import pfo.rivera.java8.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class RepositorioEjemplo {
  public static void main(String[] args) {
    System.out.println("Mucho más simple con programación funcional");

    Repositorio<Computadora> cr = new ComputadoraRepositorio();

    cr.filterComp("ROG").ifPresentOrElse(System.out::println,
                                              () -> System.out.println("No se encontró") );

    /*Otra opción
    Optional<Computadora> computerFind = cr.filterComp("Asus rog");

    if( computerFind.isPresent() ) {
      System.out.println("Resultado de búsqueda: " + computerFind.get());
    } else {
      System.out.println("No se encontraron resultados");
    }*/



  }
}
