package ro.rivera.interfacesgenericaspoo;

import ro.rivera.interfacesgenericaspoo.modelo.Cliente;
import ro.rivera.interfacesgenericaspoo.repositorio.lista.ClienteListRepositorio;
import ro.rivera.interfacesgenericaspoo.repositorio.Direccion;
import ro.rivera.interfacesgenericaspoo.repositorio.OrdenablePaginableCrudRepositorio;

import java.util.List;

public class ClienteRepositorioEjemplo {
  public static void main(String[] args) {

    OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
    repo.create(new Cliente("Irving", "Rivera"));
    repo.create(new Cliente("Angeles", "Lopez"));
    repo.create(new Cliente("Jade", "Rivera"));
    repo.create(new Cliente("Naomi", "Ruiz"));

    List<Cliente> clients = repo.toList();
    clients.forEach( cli -> System.out.println("Cliente: " + cli) );

    List<Cliente> clientsPag = repo.toList(1, 3);

    System.out.println("ForEach paginable, con forma corta en impresión");
    clientsPag.forEach( System.out::println );

    System.out.println("Ordenamiento");
    List<Cliente> clientsOrder = repo.toList("name", Direccion.ASC);
    clientsOrder.forEach( System.out::println );

    System.out.println("====== Editar ======");
    Cliente irvingAct = new Cliente("IrvingZ", "Rivers");
    irvingAct.setId(1);
    repo.edit(irvingAct);
    Cliente irving = repo.byID(1);
    System.out.println(irving);
    System.out.println("====== Lista completa despues de editar, ordeno por ID DESC ======");
    List<Cliente> clientsUpdate = repo.toList("id", Direccion.DESC);
    clientsUpdate.forEach( System.out::println );

    System.out.println("====== Borrar ======");
    repo.delete(1);
    clients.forEach( System.out::println );

    System.out.println("====== Total de registros, desde nueva interfaz ======");
    System.out.println(repo.total());


  }
}
