package pfo.rivera.java8.optional.ejemplo.repositorio;

import pfo.rivera.java8.optional.ejemplo.models.Computadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadoraRepositorio implements Repositorio<Computadora>{
  private List<Computadora> listComputers;

  public ComputadoraRepositorio() {
    listComputers = new ArrayList<>();
    listComputers.add( new Computadora("Asus ROG", "Strix G152") );
    listComputers.add( new Computadora("MacBook Pro", "MVK 2CI") );
  }

  @Override
  public Optional<Computadora> filterComp(String name) {
    return listComputers.stream().filter( c -> c.getName().contains(name)).findFirst();
    //Otra opción de implementar el método
    /*for( Computadora comp: listComputers ) {
      if( comp.getName().equalsIgnoreCase(name) ) {
        return Optional.of(comp);
      }
    }
    return Optional.empty(); */
  }

}
