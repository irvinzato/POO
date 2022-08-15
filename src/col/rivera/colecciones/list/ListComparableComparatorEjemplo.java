package col.rivera.colecciones.list;

import col.rivera.colecciones.modelo.Alumno;
import java.util.*;

public class ListComparableComparatorEjemplo {
  public static void main(String[] args) {
    //Funciona exactamente igual con "LinkedList"
    List<Alumno> students = new ArrayList<>();
    students.add(new Alumno("Emiliano", 9.0));
    students.add(new Alumno("Jade", 9.3));
    students.add(new Alumno("Camila", 8.3));
    students.add(new Alumno("Leo", 8.0));
    students.add(new Alumno("Luna", 8.2));
    students.add(new Alumno("Pablo", 8.6));
    students.add(new Alumno("Pablo", 8.6));

    //Si ordeno usando "Collections" se aplica "compareTo" el que tengo en el objeto
    System.out.println("Ordenamiento desde el método 'compareTo'(nota) implementado en el mismo objeto");
    Collections.sort(students);
    System.out.println(students);

    //Otra manera de ordenar, diciéndole desde el método
    System.out.println("Ordenamiento con instrucción(nombre) desde el método sort");
    students.sort((a, b) -> a.getName().compareTo(b.getName()));
    System.out.println(students);

    //Otra manera que se empezó a usar desde Java 8
    System.out.println("Otra manera de ordenar, desde Java 8(por nombre en reversa)");
    students.sort(Comparator.comparing(Alumno::getName).reversed());
    System.out.println(students);


    System.out.println("Iteración con expresiones lambda");
    students.forEach( a -> System.out.println(a));

  }
}
