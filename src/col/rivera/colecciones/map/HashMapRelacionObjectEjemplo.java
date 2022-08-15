package col.rivera.colecciones.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapRelacionObjectEjemplo {
  public static void main(String[] args) {

    Map<String, Object> person = new HashMap<>();
    person.put("name", "Irving");
    person.put("lastNameFa", "Silva");
    person.put("lastNameMo", "Rivera");
    person.put("email", "multizato@hotmail.com");
    person.put("age", "26");
    person.put(null, "1234");
    System.out.println("Persona: " + person);

    Map<String, String> address = new HashMap<>();
    address.put("country", "MEX");
    address.put("state", "Quintana Roo");
    address.put("city", "Tulum");
    address.put("street", "La hermosa");
    address.put("num", "120");
    //Igual que en relaciones de objetos, puedo anidar HashMap dentro de otros, también pudiera ser una clase
    person.put("address", address);

    String name = (String) person.get("name");
    System.out.println("Nombre: " + name);
    String lastName = (String) person.get("lastNameMo");
    System.out.println("Apellido: " + lastName);

    //Obtengo la dirección mediante un casteo
    Map<String, String> personAddress = (Map<String, String>) person.get("address");
    String country = personAddress.get("country");
    String state = personAddress.get("state");
    String city = personAddress.get("city");
    String neighborhood = personAddress.getOrDefault("neighborhood", "Papaya Playa"); //Si no existe la llave, doy valor por defecto
    System.out.println("Dirección de " + name + " " + lastName + ": ");
    System.out.println("Pais = " + country);
    System.out.println("Estado = " + state);
    System.out.println("Ciudad = " + city);
    System.out.println("Barrio = " + neighborhood);


    String lastNameRemove = (String) person.remove("lastNameFa");
    System.out.println("Se elimino: " + lastNameRemove);
    System.out.println("Persona: " + person);

    boolean b = person.remove("lastNameFa", "Silva");
    System.out.println("Eliminado por Llave-valor: " + b);

    boolean b2 = person.containsKey("lastNameMo");
    System.out.println("ContainsKey por llave = " + b2);

    b2 = person.containsValue("Irvin");
    System.out.println("ContainsKey por valor = " + b2);

    Collection<Object> values = person.values();
    System.out.println("Impresión de colección rescatada atraves del '.values()', no es ordenado");
    for (Object v : values) {
      System.out.println(v);
    }

    Set<String> keys = person.keySet();
    System.out.println("Impresión de llaves rescatadas por '.keySet()', no es ordenado");
    for (String k : keys) {
      System.out.println(k);
    }

    System.out.println("Tratamiento especial a Objeto o Map 'address' - Iteración mediante 'Entry' y '.entrySet()'");
    for( Map.Entry<String, Object> per : person.entrySet() ) {
      Object value = per.getValue();
      if( value instanceof Map ) { //Para dar un tratamiento especial a "address" que es tipo "Map"
        Map<String, String> addressMap = (Map<String, String>) value;
        for( Map.Entry<String, String> perAddress: addressMap.entrySet() ) {
          System.out.println( perAddress.getKey() + " - " + perAddress.getValue() );
        }
      } else {
        System.out.println(per.getKey() + " - " + value);
      }
    }

    System.out.println("Tratamiento especial a Objeto o Map 'address' - Iteración mediante '.keySet()'");
    for (String key : person.keySet()) {
      Object value = person.get(key);
      if( value instanceof Map ) { //Para dar un tratamiento especial a "address" que es tipo "Map"
        Map<String, String> addressMap = (Map<String, String>) value;
        System.out.println("Pais de la persona = " + addressMap.get("country"));
        System.out.println("Estado = " + addressMap.get("state"));
        System.out.println("Ciudad = " + addressMap.get("city"));
      } else {
        System.out.println(key + " - " + value);
      }
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
