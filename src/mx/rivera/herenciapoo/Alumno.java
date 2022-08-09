package mx.rivera.herenciapoo;

public class Alumno extends Persona{
  private String nameSchool;
  private double noteMaths;
  private double noteProgramming;
  private double noteHistory;

  public Alumno() {
    //Con súper invoca el constructor de la clase padre, siempre debe ser la primera línea y hay que ver si recibe algo su constructor
    super();
    System.out.println("Alumno: inicializando constructor");
  }

  public String getNameSchool() {
    return nameSchool;
  }

  public void setNameSchool(String nameSchool) {
    this.nameSchool = nameSchool;
  }

  public double getNoteMaths() {
    return noteMaths;
  }

  public void setNoteMaths(double noteMaths) {
    this.noteMaths = noteMaths;
  }

  public double getNoteProgramming() {
    return noteProgramming;
  }

  public void setNoteProgramming(double noteLanguage) {
    this.noteProgramming = noteLanguage;
  }

  public double getNoteHistory() {
    return noteHistory;
  }

  public void setNoteHistory(double noteHistory) {
    this.noteHistory = noteHistory;
  }
}
