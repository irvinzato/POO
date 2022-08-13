package ts.rivera.excepcionesinterfacesgenericas;
import ts.rivera.excepcionesinterfacesgenericas.modelo.Producto;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.Direccion;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.OrdenablePaginableCrudRepositorio;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.excepciones.AccesoDatoException;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.excepciones.LecturaAccesoDatoException;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.listas.ProdutoListRepositorio;

import java.util.List;

public class ProductoRepositorioEjemplo {
  public static void main(String[] args) {
    try {
      OrdenablePaginableCrudRepositorio<Producto> repo = new ProdutoListRepositorio();
      repo.create(new Producto("Papas", 12.3));
      repo.create(new Producto("Refresco", 25.5));
      repo.create(new Producto("Gansito", 14.5));
      repo.create(new Producto("Dulces", 2.5));

      List<Producto> products = repo.toList();
      products.forEach( pro -> System.out.println("Producto: " + pro) );

      List<Producto> productsPag = repo.toList(1, 3);

      System.out.println("ForEach paginable, con forma corta en impresión");
      productsPag.forEach( System.out::println );

      System.out.println("Ordenamiento");
      List<Producto> productsOrder = repo.toList("price", Direccion.ASC);
      productsOrder.forEach( System.out::println );

      System.out.println("====== Editar ======");
      Producto gansito = new Producto("GansitoEdit", 10.5);
      gansito.setId(3);
      repo.edit(gansito);
      Producto gan = repo.byID(3);
      System.out.println(gan);
      System.out.println("====== Lista completa despues de editar, ordeno por ID DESC ======");
      List<Producto> productsUpdate = repo.toList("price", Direccion.DESC);
      productsUpdate.forEach( System.out::println );

      System.out.println("====== Borrar ======");
      repo.delete(1);
      products.forEach( System.out::println );

      System.out.println("====== Total de registros, desde nueva interfaz ======");
      System.out.println(repo.total());
    } catch(LecturaAccesoDatoException lade) { //Siempre van primero las clases hijas a las más genéricas
      System.out.println("Error: " + lade.getMessage());
      lade.printStackTrace();
    } catch(AccesoDatoException ade) {
      System.out.println("Error mas genérico: " + ade.getMessage());
      ade.printStackTrace();
    }



  }
}
