package col.rivera.colecciones.set;

import col.rivera.colecciones.modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetUnicidadEjemplo {
  public static void main(String[] args) {
    //Deja agregar objetos con la misma información, pero implementé en el objeto el método "equals" y "hashCode" para prohibirlo
    Set<Alumno> students = new HashSet<>();
    students.add(new Alumno("Emiliano", 9.0));
    students.add(new Alumno("Jade", 9.3));
    students.add(new Alumno("Camila", 8.3));
    students.add(new Alumno("Leo", 8.0));
    students.add(new Alumno("Luna", 8.2));
    students.add(new Alumno("Pablo", 8.6));
    students.add(new Alumno("Pablo", 8.6));

    System.out.println(students);

    //Iteraciones típicas para cualquier tipo de colección
    System.out.println("Iteración con forEach para cualquier tipo Collection");
    for (Alumno a : students) {
      System.out.println(a);
    }

    System.out.println("Iteración con Iterator, usando while e iterator");
    Iterator<Alumno> it = students.iterator();
    while( it.hasNext() ) {
      Alumno a = it.next();
      System.out.println(a);
    }

    System.out.println("Iteración con expresiones lambda");
    students.forEach( a -> System.out.println(a));

  }
}
