package ri.rivera.interfacespoo.repositorio;
import ri.rivera.interfacespoo.modelo.Cliente;
import java.util.List;

public interface OrdenableRepositorio {
  //Mismo nombre que método en interface "CrudRepositorio" pero con campos, sobre carga de métodos
  List<Cliente> toList(String field, Direccion direction);
}
