package ri.rivera.interfacespoo.repositorio;
import ri.rivera.interfacespoo.modelo.Cliente;
import java.util.List;

public interface PaginableRepositorio {
  //otra sobre carga de métodos pero este es para paginar(desde, hasta)
  List<Cliente> toList(int from, int to);
}
