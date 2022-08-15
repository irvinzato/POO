package col.rivera.colecciones.map;

import java.util.*;

public class TreeMapEjemplo {
  public static void main(String[] args) {
    //En un "TreeMap" no pueden existir objetos nulos, son ORDENADOS atraves de la llave, también puedo indicarle como quiero ordenar en su constructor
    //Map<String, Object> person = new TreeMap<>((a,b) -> b.compareTo(a));  //Este caso es descendente, también funciona con "Comparator.reverseOrder()" desde Java 8
    Map<String, Object> person = new TreeMap<>(Comparator.comparing(String::length));  //Ordeno por tamaño de la cadena(de la llave)
    person.put("name", "Irving");
    person.put("lastNameFa", "Silva");
    person.put("lastNameMo", "Rivera");
    person.put("email", "multizato@hotmail.com");
    person.put("age", "26");
    System.out.println("Persona: " + person);

    Map<String, String> address = new TreeMap<>();
    address.put("country", "MEX");
    address.put("state", "Quintana Roo");
    address.put("city", "Tulum");
    address.put("street", "La hermosa");
    address.put("num", "120");

    person.put("address", address);

    System.out.println("Persona: " + person);




  }
}
