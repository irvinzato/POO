package ri.rivera.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion implements Iterable{
  private List objets;
  private int maxElements;

  public Camion(int maxElements) {
    this.maxElements = maxElements;
    this.objets = new ArrayList();
  }

  public void add(Object object) {
    if( this.objets.size() <= maxElements ) {
      this.objets.add(object);
    } else {
      //Sirve para manejar errores, es un objeto de excepción
      throw new RuntimeException("No hay mas espacio en el camión");
    }

  }

  @Override
  public Iterator iterator() {
    return this.objets.iterator();
  }
}
