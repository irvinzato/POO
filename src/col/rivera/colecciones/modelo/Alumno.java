package col.rivera.colecciones.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{
  private String name;
  private Double note;

  public Alumno() {
  }

  public Alumno(String name, Double note) {
    this.name = name;
    this.note = note;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getNote() {
    return note;
  }

  public void setNote(Double note) {
    this.note = note;
  }

  @Override
  public String toString() {
    return "Nombre del alumno = " + name +
            ", nota = " + note;
  }

  //Tengo que ordenar por algún atributo del objeto, lo ocupo en "TreeSetComparableEjemplo", "ListComparableComparatorEjemplo"
  @Override
  public int compareTo(Alumno student) {
    if( this.name == null ) {
      return 0;
    }
    return this.note.compareTo(student.note);
  }

  //Estos métodos los ocupo en "HashSetUnicidadEjemplo"
  @Override
  public boolean equals(Object o) {
    if (this == o) return true; //Si es idéntico el objeto(A donde apunta la referencia)
    if (o == null || getClass() != o.getClass()) return false;
    Alumno alumno = (Alumno) o;
    return Objects.equals(name, alumno.name) && Objects.equals(note, alumno.note);
  }
  //El hash debe tener los atributos que uso en el método de arriba, en la parte de "equals"
  @Override
  public int hashCode() {
    return Objects.hash(name, note);
  }
}
