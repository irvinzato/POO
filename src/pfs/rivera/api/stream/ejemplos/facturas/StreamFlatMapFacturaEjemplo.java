package pfs.rivera.api.stream.ejemplos.facturas;

import pfs.rivera.api.stream.ejemplos.models.Factura;
import pfs.rivera.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class StreamFlatMapFacturaEjemplo {
  public static void main(String[] args) {
    Usuario u1 = new Usuario("Irving", "Rivera");
    Usuario u2 = new Usuario("Angeles", "Lopez");
    Usuario u3 = new Usuario("Jade", "Guzman");
    Usuario u4 = new Usuario("Aketzalli", "Lopez");

    u1.addBill(new Factura("Primer factura, compra tecnológicas..."));
    u1.addBill(new Factura("Segunda factura, compra muebles..."));

    u2.addBill(new Factura("Compro bicicleta"));
    u2.addBill(new Factura("Compro computadora gamer"));

    System.out.println("En lugar de recorrer con forEachs las listas, lo hago con streams y operadores");
    System.out.println("También creé una relación importante en el objeto Factura para tener datos del Usuario");
    List<Usuario> users = Arrays.asList(u1, u2);
    //getBills retorna una lista por eso la transformo a stream
    users.stream()
          .flatMap( user -> user.getBills().stream() )
          .forEach( f -> System.out.println(f.getDescription()
                          .concat(" : cliente ").concat(f.getUser().toString() )));


  }
}
