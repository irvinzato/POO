package col.rivera.colecciones.set;

import col.rivera.colecciones.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparableEjemplo {
  public static void main(String[] args) {
    //También puedo implementar el "Comparable" dentro de los paréntesis del "TreeSet<>()" o como lo tengo, en el objeto
    Set<Alumno> students = new TreeSet<>();
    students.add(new Alumno("Emiliano", 9.0));
    students.add(new Alumno("Jade", 9.3));
    students.add(new Alumno("Camila", 8.3));
    students.add(new Alumno("Leo", 8.0));
    students.add(new Alumno("Luna", 8.2));
    students.add(new Alumno("Pablo", 8.6));
    //Como tengo la regla "compareTo" por nota, no puede haber notas repetidas, lo mismo si cambio la regla a nombre
    students.add(new Alumno("Cesar", 8.6));

    //Como es un objeto lo que se quiere ordenar, se necesita implementar el compareTo
    System.out.println(students);

  }
}
