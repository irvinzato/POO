package col.rivera.colecciones.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetBuscarDuplicadoEjemplo {
  public static void main(String[] args) {
    String[] fishes = { "Corvina", "Lenguado", "Pejerrey", "Robalo", "Atún", "Lenguado", "Corvina" };
    Set<String> shUniques = new HashSet<>();
    Set<String> shRepeated = new HashSet<>();

    for( String fish: fishes ) {
      if( !shUniques.add(fish) ) {
        System.out.println("Elemento duplicado: " + fish);
        shRepeated.add(fish);
      }
    }
    //Remuevo del primer arreglo los elementos repetidos que guarde en el otro arreglo
    shUniques.removeAll(shRepeated);

    System.out.println("Elementos unicos: " + shUniques.size() + " elementos no duplicados: " + shUniques);
    System.out.println("Elementos repetidos: " + shRepeated.size() + " elementos: " + shRepeated);

  }
}
