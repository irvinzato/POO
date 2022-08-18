package pfo.rivera.java8.optional.ejemplo.repositorio;

import pfo.rivera.java8.optional.ejemplo.models.Computadora;
import java.util.Optional;

public interface Repositorio<T> {
  //Pudiera resolver con condiciones pero la idea es utilizar la API "Optional"
  Optional<Computadora> filterComp(String name);
}
