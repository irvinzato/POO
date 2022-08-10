package mx.rivera.herenciapoo;

public class Alumno extends Persona{
  private String nameSchool;
  private double noteMaths;
  private double noteProgramming;
  private double noteHistory;

  public Alumno() {
    //Con súper invoca el constructor de la clase padre, siempre debe ser la primera línea y hay que ver si recibe algo su constructor, se llama automáticamente cuando no tiene parámetros
    super();
    System.out.println("Alumno: inicializando constructor");
  }

  public Alumno(String name, String lastName) {
    super(name, lastName);
  }

  public Alumno(String name, String lastName, int age) {
    super(name, lastName, age);
  }

  public Alumno(String name, String lastName, int age, String nameSchool) {
    //En este caso también pudiera usar "this" en lugar de "super" ya que igual lo mando a llamar
    super(name, lastName, age);
    this.nameSchool = nameSchool;
  }

  public Alumno(String name, String lastName, int age, String nameSchool, double noteMaths, double noteProgramming, double noteHistory) {
    this(name, lastName, age, nameSchool);
    this.noteMaths = noteMaths;
    this.noteProgramming = noteProgramming;
    this.noteHistory = noteHistory;
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

  //Sobre carga de métodos
  @Override
  public String greet() {
    //Puedo reutilizar lo que tiene el método del padre usando el super
    String greeting = super.greet();
    return greeting + ", soy alumno y me llamo " + getName();
  }

  public double calculateAverage() {
    return (noteMaths + noteProgramming + noteHistory) / 3;
  }
}
