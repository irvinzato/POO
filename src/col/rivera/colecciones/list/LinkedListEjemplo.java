package col.rivera.colecciones.list;

import col.rivera.colecciones.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEjemplo {
  public static void main(String[] args) {
    //LinkedList es del tipo lista "enlazada", contiene más métodos. Para manipular datos intermedios es mucho más rápido
    LinkedList<Alumno> students = new LinkedList<>();
    System.out.println("Lista: " + students + ", size: " + students.size());
    System.out.println("¿Esta vacia?: " + students.isEmpty());
    students.add(new Alumno("Emiliano", 9.0));
    students.add(new Alumno("Jade", 9.3));
    students.add(new Alumno("Camila", 8.3));
    students.add(new Alumno("Leo", 8.0));
    students.add(new Alumno("Luna", 8.2));
    students.add(new Alumno("Pablo", 8.6));
    students.add(new Alumno("Pablo", 8.6));
    System.out.println("Lista: " + students + ", size: " + students.size());

    students.addFirst(new Alumno("Zeus", 9.6));
    students.addLast(new Alumno("Adan", 9.3));
    System.out.println("Lista después de first y last: " + students + ", size: " + students.size());

    System.out.println("Primer elemento: " + students.getFirst()); //Parecido a usar ".peekFirst" o "Last". La diferencia es que "peek" no lanza excepción si la lista está vacía, daria null
    System.out.println("Ultimo elemento: " + students.getLast());
    System.out.println("Mediante el indice: " + students.get(2));

    Alumno zeus = students.removeFirst(); //Puedo solo eliminar o extraer el valor para usarlo
    students.removeLast(); //"poll" es similar pero tampoco regresa excepción si la lista está vacía
    System.out.println("Lista: " + students + ", size: " + students.size());

    students.remove(new Alumno("Luna", 8.2)); //Eliminar por objeto
    System.out.println("Lista: " + students + ", size: " + students.size());

    Alumno shiva = new Alumno("Shiva", 9.3);
    students.addLast(shiva);
    System.out.println("Indice del elemento " + students.indexOf(shiva));

    students.remove(3); //Eliminar por indice
    System.out.println("Lista: " + students + ", size: " + students.size());

    students.set(4, new Alumno("Baco", 9.0));
    System.out.println("Lista: " + students + ", size: " + students.size());

    //Uso del ListIterator
    ListIterator<Alumno> li = students.listIterator();
    System.out.println("ListIterator con next, next retorna el objeto 'Alumno': ");
    while( li.hasNext() ) {
      System.out.println(li.next());
    }

    System.out.println("Ahora con previous, recordar que no se puede partir con previous porque tiene que haber elementos en el cursor:");
    while( li.hasPrevious() ) {
      System.out.println(li.previous());
    }



  }
}
