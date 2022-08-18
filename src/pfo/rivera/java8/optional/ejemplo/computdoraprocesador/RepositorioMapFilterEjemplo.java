package pfo.rivera.java8.optional.ejemplo.computdoraprocesador;

import pfo.rivera.java8.optional.ejemplo.models.*;
import pfo.rivera.java8.optional.ejemplo.repositorio.ComputadoraRepositorio;
import pfo.rivera.java8.optional.ejemplo.repositorio.Repositorio;

public class RepositorioMapFilterEjemplo {
  public static void main(String[] args) {
    System.out.println("Ejemplo de Computadora con procesador y fabricante");

    Repositorio<Computadora> cr = new ComputadoraRepositorio();

    //De la Computadora voy transformando con el "map" para obtener el Fabricante
    Fabricante pcMaker = cr.filterComp("Asus") //"Mac" no le puse procesador, entraría al "orElse"
                      .map( c -> c.getProcessor() )
                      .map( p -> p.getMaker())
                      //.map( f -> f.getName() ) //Pudiera seguir recorriendo para transformar el Fabricante a String
                      .orElse(new Fabricante("Desconocido"));
    System.out.println("Recorrido con map para obtener Fabricante: " + pcMaker.getName());



    System.out.println("SEGUNDO EJEMPLO, CON FILTER PARA QUE SOLO DE UN TIPO DE FABRICANTE");
    String pcMakerStr = cr.filterComp("Asus")
                      .map( c -> c.getProcessor() )
                      .map( p -> p.getMaker())
                      .filter( f -> "intel".equalsIgnoreCase(f.getName()) )
                      .map( f -> f.getName() )
                      .orElse("Desconocido");
    System.out.println("Recorrido con map para obtener Fabricante: " + pcMakerStr);

    System.out.println("Nota: Si devolviera un 'Optional' de los objetos usaría 'flatMap'." +
                        "Con objetos normales 'map', igual que en Stream");


  }


}
