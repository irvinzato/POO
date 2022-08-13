package ts.rivera.excepcionesinterfacesgenericas.repositorio;
import java.util.List;

public interface PaginableRepositorio<T> {
  List<T> toList(int from, int to);
}
