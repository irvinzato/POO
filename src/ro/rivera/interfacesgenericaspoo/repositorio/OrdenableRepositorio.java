package ro.rivera.interfacesgenericaspoo.repositorio;

import java.util.List;

public interface OrdenableRepositorio<T> {
  List<T> toList(String field, Direccion direction);
}
