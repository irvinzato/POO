package mx.rivera.herenciapoo;

public class AlumnoInternacional extends Alumno{
  private String country;
  private double noteLanguages;

  public AlumnoInternacional() {
    System.out.println("AlumnoInternacional: inicializando constructor");
  }

  public AlumnoInternacional(String name, String lastName) {
    super(name, lastName);
  }

  public AlumnoInternacional(String name, String lastName, String country) {
    super(name, lastName);
    this.country = country;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public double getNoteLanguages() {
    return noteLanguages;
  }

  public void setNoteLanguages(double noteLanguages) {
    this.noteLanguages = noteLanguages;
  }
}
