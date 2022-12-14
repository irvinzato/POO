package ri.rivera.generics;
import ri.rivera.interfacespoo.modelo.Cliente;
import ri.rivera.interfacespoo.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericosEjemplo {
  public static void main(String[] args) {
    //Los genéricos ayudan mucho a evitar errores en especial de casteo
    List<Cliente> clients = new ArrayList<>();
    clients.add(new Cliente("Irving", "Rivera"));

    Cliente irving = clients.get(0);

    Cliente[] clientsArr = {new Cliente("Irving", "Rivera"), new Cliente("Angeles", "Lopez"),
            new Cliente("Jesus", "Rivera"), new Cliente("Jade", "Lopez")};

    Integer[] integersArr = { 1, 2, 3, 4, 5, 6 };

    //Puedo convertir un arreglo de clientes a una lista usando el método de forma genérica y lo mismo con arreglos
    List<Cliente> clientsList = fromArrayToList(clientsArr);
    List<Integer> integersList = fromArrayToList(integersArr);


    System.out.println("Lista de clientes");
    clientsList.forEach(System.out::println);
    System.out.println("Lista de enteros");
    integersList.forEach(System.out::println);

    System.out.println("Metodo generico con 2 atributos");
    List<String> stringList = fromArrayToList(new String[]{"Irving", "Jade", "Angeles", "Jesus"}, integersArr);
    stringList.forEach(System.out::println);

    List<ClientePremium> clientsPremium = fromArrayToListClient(
            new ClientePremium[]{ new ClientePremium("Aketzalli", "Rivers"),
            new ClientePremium("Naomi", "Ramos")});

    System.out.println("Metodo imprimir clientes");
    toPrintClients(clients);
    toPrintClients(clientsList);
    toPrintClients(clientsPremium);

    System.out.println("Metodo que compara 3 genericos");
    System.out.println(max(1.4, 9.5, 5.7));
    System.out.println(max("Zanahoria", "Arandano", "Durazno"));


  }

  //Antes el método retornaba "List<Cliente>" y recibía un arreglo de clientes, lo modifiqué de la sig. manera para que acepte cualquier lista
  //Métodos genericos(Mucho más reutilizables, se aplican a muchos tipos de datos)
  public static <T> List<T> fromArrayToList(T[] c) {
    return Arrays.asList(c);  //Método que convierte un arreglo a una lista
  }

  //Un elemento solo lo itera "g" y el otro lo combierte a lista
  public static <T, G> List<T> fromArrayToList(T[] t, G[] g) {
    for(G element: g) {
      System.out.println(element);
    }
    return Arrays.asList(t);
  }

  //Se pueden limitar los genericos, de esta manera solo dejará pasar arreglos de tipo Number(int,double, float,etc)
  public static <T extends Number> List<T> fromArrayToListNumber(T[] c) {
    return Arrays.asList(c);
  }
  //Limito a cualquier tipo de Cliente y sub-clases por ejemplo ClientePremium, puedo limitar aún más con "&" y una interfaz
  public static <T extends Cliente & Comparable<T>> List<T> fromArrayToListClient(T[] c) {
    return Arrays.asList(c);
  }

  /*Este método es equivalente al de arriba, por eso no se puede tener 2 veces
  public static List<Cliente> fromArrayToListClient(Cliente[] c) {
    return Arrays.asList(c);
  }*/

  //Aquí solo deja pasar las listas tipo "Cliente" pero no su descendencia, una lista no hereda
  //Añado "? extends Cliente" para que pase cualquier clase hija
  public static void toPrintClients(List< ? extends Cliente > clients) {
    clients.forEach(System.out::println);
  }

  public static <T extends Comparable<T>> T max(T a, T b, T c) {
    T max = a;
    if( b.compareTo(max) > 0 ) {
      max = b;
    }
    if( c.compareTo(max) > 0 ) {
      max = c;
    }
    return max;
  }


}
