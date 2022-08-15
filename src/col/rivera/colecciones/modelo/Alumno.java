package col.rivera.colecciones.modelo;

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
            ", nota = " + note + "\n";
  }

  //Tengo que ordenar por algún atributo del objeto
  @Override
  public int compareTo(Alumno student) {
    if( this.name == null ) {
      return 0;
    }
    return this.note.compareTo(student.note);
  }
}
