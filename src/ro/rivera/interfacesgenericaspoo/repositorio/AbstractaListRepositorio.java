package ro.rivera.interfacesgenericaspoo.repositorio;

import java.util.ArrayList;
import java.util.List;
//En esta clase están TODOS los métodos y atributos que se pueden REUTILIZAR
//Ahora le paso de manera genérica "Cliente" y le podría pasar cualquiera, algunos métodos también pudieran ser genéricos
public abstract class AbstractaListRepositorio<T> implements OrdenablePaginableCrudRepositorio<T> {
  protected List<T> dataSource;

  public AbstractaListRepositorio() {
    this.dataSource = new ArrayList<>();
  }

  @Override
  public List<T> toList() {
    return this.dataSource;
  }

  /*@Override
  public Cliente byID(Integer id) {
    Cliente c = null;
    for( Cliente cli: this.dataSource ) {
      if( cli.getId().equals(id) && cli.getId() != null ) {  //Con equals porque es un objeto
        c = cli;
        break;
      }
    }
    return c;
  }*/

  @Override
  public void create(T t) {
    this.dataSource.add(t);
  }

  @Override
  public void delete(Integer id) {
    T c = this.byID(id);
    this.dataSource.remove(c);
  }

  @Override
  public List<T> toList(int from, int to) {
    return this.dataSource.subList( from, to );
  }

  @Override
  public int total() {
    return this.dataSource.size();
  }
}
