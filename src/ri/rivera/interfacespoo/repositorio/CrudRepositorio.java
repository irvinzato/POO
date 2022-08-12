package ri.rivera.interfacespoo.repositorio;
import ri.rivera.interfacespoo.modelo.Cliente;
import java.util.List;
//Representación de un CRUD de DB(Crear, Leer, Actualizar, Borrar)
public interface CrudRepositorio {
  List<Cliente> toList();
  Cliente byID(Integer id);
  void create(Cliente client);
  void edit(Cliente client);
  void delete(Integer id);
}
