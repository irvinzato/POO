package ts.rivera.excepcionesinterfacesgenericas.repositorio;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.excepciones.AccesoDatoException;

import java.util.List;

public interface CrudRepositorio<T> {
  List<T> toList();
  //Queda mejor "AccesoDatoException" porque es la más genérica, "LecturaAccesoDatoException" es su hija
  T byID(Integer id) throws AccesoDatoException;
  void create(T obj) throws AccesoDatoException ;
  void edit(T obj) throws AccesoDatoException;
  void delete(Integer id) throws AccesoDatoException;
}
