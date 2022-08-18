package pfs.rivera.api.stream.ejemplos;

import pfs.rivera.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class StreamParallelEjemplo {
  public static void main(String[] args) {
    System.out.println("Operador parallel() con test de tiempo, mucho mas rápido con los thread en paralelo");
    System.out.println("Se utiliza cuando hay una gran cantidad de elementos que procesar en el flujo");
    List<Usuario> list = new ArrayList<>();
    list.add(new Usuario("Irving", "Rivera"));
    list.add(new Usuario("Angeles", "Lopez"));
    list.add(new Usuario("Jade", "Guzman"));
    list.add(new Usuario("Aketzalli", "Lopez"));
    list.add(new Usuario("Jesus", "Silva"));
    list.add(new Usuario("Jesus", "Smith"));
    list.add(new Usuario("Naomi", "Ruiz"));

    long t1 = System.currentTimeMillis();
    //Si filtro antes del map, seria sobre los objetos Usuario, después seria con los Strings
    String result = list.stream()
                        .parallel()   //Para que se ejecuten todos en paralelo(Mucho más rápido), sin él es secuencial
                        .map( u -> u.toString().toUpperCase())
                        .peek( n -> {
                          System.out.println("Nombre del Thread: " + Thread.currentThread().getName() + " - " + n);
                        })
                        .flatMap( name -> {  //parecido al filter
                          try {
                            TimeUnit.SECONDS.sleep(1);
                          } catch (InterruptedException e) {
                            e.printStackTrace();
                          }
                          if( name.contains("jesus".toUpperCase()) )  {
                            return Stream.of(name);
                          }
                          return Stream.empty();
                        })
                        .findAny().orElse("");
    long t2 = System.currentTimeMillis();

    System.out.println("Tiempo total: " + (t2 - t1) );
    System.out.println("Total de resultados: " + result);


  }
}
