package ro.rivera.interfacesgenericaspoo.repositorio;
import java.util.List;
//Creé el proyecto "ri.rivera.interfacespoo" a genérico en este package, remplazo todos los "Cliente" por "T" y defino <T> en el nombre de la interface
//La idea es que permita realizar CRUD a cualquier tipo, no solo a "Cliente"
public interface CrudRepositorio<T> {
  List<T> toList();
  T byID(Integer id);
  void create(T obj);
  void edit(T obj);
  void delete(Integer id);
}
