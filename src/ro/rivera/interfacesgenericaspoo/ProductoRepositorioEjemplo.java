package ro.rivera.interfacesgenericaspoo;

import ro.rivera.interfacesgenericaspoo.modelo.Producto;
import ro.rivera.interfacesgenericaspoo.repositorio.Direccion;
import ro.rivera.interfacesgenericaspoo.repositorio.OrdenablePaginableCrudRepositorio;
import ro.rivera.interfacesgenericaspoo.repositorio.lista.ProdutoListRepositorio;

import java.util.List;

public class ProductoRepositorioEjemplo {
  public static void main(String[] args) {

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


  }
}
