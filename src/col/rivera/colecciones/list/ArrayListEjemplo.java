package col.rivera.colecciones.list;

import col.rivera.colecciones.modelo.Alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Esta clase tiene métodos importantes de los "List"
public class ArrayListEjemplo {
  public static void main(String[] args) {
    //Funciona exactamente igual con "LinkedList"
    List<Alumno> students = new ArrayList<>();
    System.out.println("Lista: " + students + ", size: " + students.size());
    System.out.println("¿Esta vacia?: " + students.isEmpty());
    students.add(new Alumno("Emiliano", 9.0));
    students.add(new Alumno("Jade", 9.3));
    students.add(new Alumno("Camila", 8.3));
    students.add(new Alumno("Leo", 8.0));
    students.set(3, new Alumno("Luna", 8.2)); //Con "set" elimina el que estaba en dicha posición por el que se indica
    students.add(2, new Alumno("Pablo", 8.6)); //Para guardar en cierta posición
    students.add(new Alumno("Pablo", 8.6));
    System.out.println("Lista: " + students + ", size: " + students.size());

    students.remove(new Alumno("Emiliano", 9.0)); //El objeto tiene que ser idéntico, utiliza el método "equals" del objeto
    System.out.println("Remove por objeto: " + students + ", size: " + students.size());

    students.remove(4);
    System.out.println("Remove por indice: " + students + ", size: " + students.size());

    //Muy importante el método "equals" también para el "contains"
    boolean b1 = students.contains(new Alumno("Jade", 9.3));
    System.out.println("Contains, ¿La lista contiene a Jade? " + b1);
    boolean b2 = students.contains(new Alumno("Emiliano", 9.0));
    System.out.println("Contains, ¿La lista contiene a Emiliano? " + b2);

    Object a[] = students.toArray(); //Convertir Lista a ArrayList
    System.out.println("De List a arreglo");
    for(int i = 0; i < a.length; i++ ) {
      System.out.println(i + " " + a[i]);
    }


  }
}
