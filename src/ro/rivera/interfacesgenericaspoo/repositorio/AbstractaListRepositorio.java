package ro.rivera.interfacesgenericaspoo.repositorio;

import ro.rivera.interfacesgenericaspoo.modelo.BaseEntity;

import java.util.ArrayList;
import java.util.List;
//En esta clase están TODOS los métodos y atributos que se pueden REUTILIZAR
//Ahora le paso de manera genérica "Cliente" y le podría pasar cualquiera, algunos métodos también pudieran ser genéricos
public abstract class AbstractaListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T> {
  protected List<T> dataSource;

  public AbstractaListRepositorio() {
    this.dataSource = new ArrayList<>();
  }

  @Override
  public List<T> toList() {
    return this.dataSource;
  }

  @Override
  public T byID(Integer id) {
    T c = null;
    for( T cli: this.dataSource ) {
      if( cli.getId().equals(id) && cli.getId() != null ) {  //Con equals porque es un objeto
        c = cli;
        break;
      }
    }
    return c;
  }

  @Override
  public void create(T t) {
    this.dataSource.add(t);
  }

  @Override
  public void delete(Integer id) {
    T obj = this.byID(id);
    this.dataSource.remove(obj);
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
