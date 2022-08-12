package ro.rivera.interfacesgenericaspoo.repositorio;
import ro.rivera.interfacesgenericaspoo.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Esta es una clase concreta y HEREDA todos los métodos reutilizables de la clase abstracta, le paso mi Objeto concreto
public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {

  /* Hice este método reutilizable, lo implemente en la clase padre para cualquier clase concreta
  @Override
  public Cliente byID(Integer id) {
    Cliente c = null;
    for( Cliente cli: this.dataSource ) {
      if( cli.getId().equals(id) && cli.getId() != null ) {  //Con equals porque es un objeto
        c = cli;
        break;
      }
    }
    return c;
  }*/

  @Override
  public void edit(Cliente client) {
    Cliente c = this.byID(client.getId());
    c.setName(client.getName());
    c.setLastName(client.getLastName());
  }

  @Override
  public List<Cliente> toList(String field, Direccion direction) {
    //A partir de la lista original genero una nueva para que no sea afectada la original cada que se realizan movimientos
    List<Cliente> listOrder = new ArrayList<>(this.dataSource);
    //La interfaz Comparable mi sirve para comparar Objetos, también puedo simplificarlo en expresión lambda. ep.217
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
