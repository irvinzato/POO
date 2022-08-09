package mx.rivera.herenciapoo;

public class Profesor extends Persona{
  private String course;

  public Profesor() {
    System.out.println("Profesor: inicializando constructor");
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }
}
