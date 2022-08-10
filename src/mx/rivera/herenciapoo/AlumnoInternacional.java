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

  @Override
  public String greet() {
    return super.greet() + " soy alumno de intercambio, vengo de " + getCountry();
  }

  @Override
  public double calculateAverage() {
    //Ocupo el método del padre porque contiene las otras materias que ocupo para el promedio de esta clase
    return ((super.calculateAverage() * 3) + noteLanguages) / 4 ;
  }
}
