package ri.rivera.generics;
import ri.rivera.interfacespoo.modelo.Cliente;
import ri.rivera.interfacespoo.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
    return Arrays.asList(c);  //Método que convierte un arreglo a una lista
  }
  //Limito a cualquier tipo de Cliente y sub-clases por ejemplo ClientePremium, puedo limitar aún más con "&" y una interfaz
  public static <T extends Cliente & Comparable<T>> List<T> fromArrayToListClient(T[] c) {
    return Arrays.asList(c);  //Método que convierte un arreglo a una lista
  }


}
