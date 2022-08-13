package ts.rivera.excepcionesinterfacesgenericas;

import ts.rivera.excepcionesinterfacesgenericas.modelo.Cliente;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.Direccion;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.OrdenablePaginableCrudRepositorio;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.excepciones.AccesoDatoException;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.excepciones.EscrituraAccesoDatoException;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.excepciones.LecturaAccesoDatoException;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.listas.ClienteListRepositorio;

import java.util.List;

public class ClienteRepositorioEjemplo {
  public static void main(String[] args) {

    try {
      OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
      repo.create(new Cliente("Irving", "Rivera"));
      repo.create(new Cliente("Angeles", "Lopez"));
      repo.create(new Cliente("Jade", "Rivera"));
      repo.create(new Cliente("Naomi", "Ruiz"));

      repo.create(null);

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

    } catch(LecturaAccesoDatoException lade) { //Siempre van primero las clases hijas a las más genéricas
      System.out.println("Error de lectura: " + lade.getMessage());
      lade.printStackTrace();
    } catch(EscrituraAccesoDatoException eade) {
      System.out.println("Error de escritura: " + eade.getMessage());
      eade.printStackTrace();
    } catch(AccesoDatoException ade) {
      System.out.println("Error mas genérico: " + ade.getMessage());
      ade.printStackTrace();
    }



  }
}
