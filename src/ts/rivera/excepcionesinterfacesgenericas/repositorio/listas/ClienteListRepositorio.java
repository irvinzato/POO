package ts.rivera.excepcionesinterfacesgenericas.repositorio.listas;
import ts.rivera.excepcionesinterfacesgenericas.modelo.Cliente;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.AbstractaListRepositorio;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.Direccion;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {

  @Override
  public void edit(Cliente client) throws LecturaAccesoDatoException {
    Cliente c = this.byID(client.getId());
    c.setName(client.getName());
    c.setLastName(client.getLastName());
  }

  @Override
  public List<Cliente> toList(String field, Direccion direction) {
    List<Cliente> listOrder = new ArrayList<>(this.dataSource);
    listOrder.sort(new Comparator<Cliente>() {
      @Override
      public int compare(Cliente a, Cliente b) {
        int res = 0;
        if( direction == Direccion.ASC ) {
          switch ( field ) {
            case "id" -> res = a.getId().compareTo(b.getId());
            case "name" -> res = a.getName().compareTo(b.getName());
            case "lastName" -> res = a.getLastName().compareTo(b.getLastName());
          }
        } else if( direction == Direccion.DESC ) {
          switch ( field ) {
            case "id" -> res = b.getId().compareTo(a.getId());
            case "name" -> res = b.getName().compareTo(a.getName());
            case "lastName" -> res = b.getLastName().compareTo(a.getLastName());
          }
        }
        return res;
      }
    });
    return listOrder;
  }

}
