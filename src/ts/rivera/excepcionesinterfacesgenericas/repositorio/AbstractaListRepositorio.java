package ts.rivera.excepcionesinterfacesgenericas.repositorio;

import ts.rivera.excepcionesinterfacesgenericas.modelo.BaseEntity;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.excepciones.EscrituraAccesoDatoException;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T> {
  protected List<T> dataSource;

  public AbstractaListRepositorio() {
    this.dataSource = new ArrayList<>();
  }

  @Override
  public List<T> toList() {
    return this.dataSource;
  }

  @Override //Como esté método viene de una interfaz, la interfaz también debe tener el "throws" de la excepción
  public T byID(Integer id) throws LecturaAccesoDatoException {
    if( id == null || id <= 0 ) {
      throw new LecturaAccesoDatoException("Id inválido, deber ser mayor que 0 y diferente de null");
    }
    T c = null;
    for( T cli: this.dataSource ) {
      if( cli.getId().equals(id) && cli.getId() != null ) {  //Con equals porque es un objeto
        c = cli;
        break;
      }
    }
    if( c == null ) {
      throw new LecturaAccesoDatoException("No se encuentra dicho ID");
    }
    return c;
  }

  @Override
  public void create(T t) throws EscrituraAccesoDatoException {
    if( t == null ) {
      throw new EscrituraAccesoDatoException("Error al insertar un objeto, no se puede agregar null");
    }
    this.dataSource.add(t);
  }

  @Override
  public void delete(Integer id) throws LecturaAccesoDatoException {
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
