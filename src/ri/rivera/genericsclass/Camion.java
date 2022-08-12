package ri.rivera.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Si no implemento "Iterable" no permite utilizar los "for" de los objetos en la clase principal
//Una clase genérica también lleva el diamante "<>" para indicar
public class Camion<T> implements Iterable<T>{
  private List<T> objets;
  private int maxElements;

  public Camion(int maxElements) {
    this.maxElements = maxElements;
    this.objets = new ArrayList<>();
  }

  public void add(T object) {
    if( this.objets.size() <= maxElements ) {
      this.objets.add(object);
    } else {
      //Sirve para manejar errores, es un objeto de excepción
      throw new RuntimeException("No hay mas espacio en el camión");
    }
  }

  @Override
  public Iterator<T> iterator() {
    return this.objets.iterator();
  }
}
