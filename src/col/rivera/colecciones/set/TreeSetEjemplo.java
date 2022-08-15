package col.rivera.colecciones.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEjemplo {
  public static void main(String[] args) {
    Set<String> ts = new TreeSet<>();
    ts.add("Buda");
    ts.add("Jack");
    ts.add("Raiden");
    ts.add("Raiden");
    ts.add("Shiva");
    ts.add("Loki");

    System.out.println("TreeSet son ordenados pero mas lentos en agregar, eliminar, etc. Todos los SET no permiten elementos duplicados");
    System.out.println("NO mantienen el orden de registro pero si el orden alfabético");
    System.out.println("TreeSet: " + ts);

    //Puedo modificar su "compareTo", ahora lo pongo descendente(Pudiera usar expresiones lambda o un método que recomiendo IJ)
    Set<Integer> numbers = new TreeSet<>(new Comparator<Integer>() {
      @Override
      public int compare(Integer a, Integer b) {
        return b.compareTo(a);
      }
    });
    numbers.add(6);
    numbers.add(1);
    numbers.add(4);
    numbers.add(3);
    numbers.add(2);
    numbers.add(10);
    numbers.add(5);

    System.out.println("Números con TreeSet: " + numbers);


  }
}
