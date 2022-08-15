package col.rivera.colecciones.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEjemplo {
  public static void main(String[] args) {
    //<"Llave", "Valor"> - Nombre de atributo(Llave) asociado a un valor
    Map<String, String> person = new HashMap<>();
    //Estructura de datos similar a la de un objeto, las llaves deben ser únicas, no permite tener 2 o más
    person.put("name", "Irving");
    person.put("lastNameFa", "Silva");
    person.put("lastNameMo", "Rivera");
    person.put("email", "multizato@hotmail.com");
    person.put("age", "26");
    person.put(null, "1234");
    System.out.println("Persona: " + person);

    String name = person.get("name");
    System.out.println("Nombre: " + name);
    String lastName = person.get("lastNameMo");
    System.out.println("Apellido: " + lastName);

    //Métodos importantes
    String lastNameRemove = person.remove("lastNameFa"); //Remove por llave retorna valor
    System.out.println("Se elimino: " + lastNameRemove);
    System.out.println("Persona: " + person);

    boolean b = person.remove("lastNameFa", "Silva"); //Remove por llave y valor retorna boolean
    System.out.println("Eliminado por Llave-valor: " + b);

    boolean b2 = person.containsKey("lastNameMo");
    System.out.println("ContainsKey por llave = " + b2);

    b2 = person.containsValue("Irvin");
    System.out.println("ContainsKey por valor = " + b2);

    Collection<String> values = person.values(); //"values()" retorna una colección
    System.out.println("Impresión de colección rescatada atraves del '.values()', no es ordenado");
    for (String v : values) {
      System.out.println(v);
    }

    Set<String> keys = person.keySet(); //"keySet()" retorna las llaves
    System.out.println("Impresión de llaves rescatadas por '.keySet()', no es ordenado");
    for (String k : keys) {
      System.out.println(k);
    }

    System.out.println("Iteración mediante 'Entry' y '.entrySet()'");
    for (Map.Entry<String, String> par : person.entrySet()) {
      System.out.println(par.getKey() + " - " + par.getValue());
    }

    System.out.println("Iteración mediante '.keySet()'");
    for (String key : person.keySet()) {
      String value = person.get(key); //atraves de la llave obtengo el valor
      System.out.println(key + " - " + value);
    }

    System.out.println("Iteración mediante forEach y lambda, Java 8");
    person.forEach( (key, value) -> {
      System.out.println(key + " - " + value);
    });

    System.out.println("Otros métodos");
    System.out.println("Total: " + person.size());
    System.out.println("Contiene elementos: " + !person.isEmpty());

    //person.replace("name", "Irving", "Mauricio"); //Remplazar un valor viejo por un valor nuevo
    person.replace("name", "Mauricio");
    System.out.println("Remplazar llave con valor: " + person);


  }
}
