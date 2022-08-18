package pfo.rivera.java8.optional.ejemplo;

import pfo.rivera.java8.optional.ejemplo.models.Computadora;
import pfo.rivera.java8.optional.ejemplo.repositorio.ComputadoraRepositorio;
import pfo.rivera.java8.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class RepositorioMetodosOrElseThrowEjemplo {
  public static void main(String[] args) {
    System.out.println("orElseThrow si no existe lanza una excepción, muy parecido al get");

    Repositorio<Computadora> cr = new ComputadoraRepositorio();

    Computadora pc = cr.filterComp("Asus").orElseThrow( () -> new IllegalStateException() );
    System.out.println("orElse retorno: " + pc);


    System.out.println("SEGUNDO EJEMPLO - Extensión de un archivo, Optional al igual que Stream tiene filter y map");
    String file = "documento.pdf";
    String extension = Optional.ofNullable(file)
                               .filter( f -> f.contains(".") )
                                .map( f -> f.substring(file.lastIndexOf(".") + 1 )) //La última posición donde hay "."
                                .orElseThrow();
    System.out.println("extension: " + extension);

  }

}
