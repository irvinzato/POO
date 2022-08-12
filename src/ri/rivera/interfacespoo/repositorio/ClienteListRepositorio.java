package ri.rivera.interfacespoo.repositorio;

import ri.rivera.interfacespoo.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio, PaginableRepositorio{
  private List<Cliente> dataSource;

  public ClienteListRepositorio() {
    this.dataSource = new ArrayList<>();
  }

  @Override
  public List<Cliente> toList() {
    return this.dataSource;
  }

  @Override
  public Cliente byID(Integer id) {
    Cliente c = null;
    for( Cliente cli: this.dataSource ) {
      if( cli.getId().equals(id) ) {  //Con equals porque es un objeto
        c = cli;
        break;
      }
    }
    return c;
  }

  @Override
  public void create(Cliente client) {
    this.dataSource.add(client);
  }

  @Override
  public void edit(Cliente client) {
    Cliente c = this.byID(client.getId());
    c.setName(client.getName());
    c.setLastName(client.getLastName());
  }

  @Override
  public void delete(Integer id) {
    Cliente c = this.byID(id);
    this.dataSource.remove(c); //El método "remove" utiliza "equals" por lo que se debe implementar en Cliente
  }

  @Override
  public List<Cliente> toList(String field, Direccion direction) {
    //La interfaz Comparable mi sirve para comparar Objetos, también puedo simplificarlo en expresión lambda. ep.217
    this.dataSource.sort(new Comparator<Cliente>() {
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
    return this.dataSource;
  }

  @Override
  public List<Cliente> toList(int from, int to) {
    return this.dataSource.subList( from, to );
  }
}
