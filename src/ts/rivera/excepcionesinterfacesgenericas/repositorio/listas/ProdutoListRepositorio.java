package ts.rivera.excepcionesinterfacesgenericas.repositorio.listas;
import ts.rivera.excepcionesinterfacesgenericas.modelo.Producto;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.AbstractaListRepositorio;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.Direccion;
import ts.rivera.excepcionesinterfacesgenericas.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProdutoListRepositorio extends AbstractaListRepositorio<Producto> {

  @Override
  public void edit(Producto prod) throws LecturaAccesoDatoException {
    Producto p = this.byID(prod.getId());
    p.setPrice(prod.getPrice());
    p.setDesc(prod.getDesc());
  }

  @Override
  public List<Producto> toList(String field, Direccion direction) {
    List<Producto> listOrder = new ArrayList<>(this.dataSource);
    listOrder.sort(new Comparator<Producto>() {
      @Override
      public int compare(Producto a, Producto b) {
        int res = 0;
        if( direction == Direccion.ASC ) {
          switch ( field ) {
            case "id" -> res = a.getId().compareTo(b.getId());
            case "price" -> res = a.getPrice().compareTo(b.getPrice());
            case "desc" -> res = a.getDesc().compareTo(b.getDesc());
          }
        } else if( direction == Direccion.DESC ) {
          switch ( field ) {
            case "id" -> res = b.getId().compareTo(a.getId());
            case "price" -> res = b.getPrice().compareTo(a.getPrice());
            case "desc" -> res = b.getDesc().compareTo(a.getDesc());
          }
        }
        return res;
      }
    });
    return listOrder;
  }
}
