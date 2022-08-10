package mx.rivera.herenciapoo;

public class Profesor extends Persona{
  private String course;

  public Profesor() {
    System.out.println("Profesor: inicializando constructor");
  }

  public Profesor(String name, String lastName) {
    super(name, lastName);
  }

  public Profesor(String name, String lastName, String course) {
    super(name, lastName);
    this.course = course;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  @Override
  public String greet() {
    return "Hola soy el profesor, me llamo " + getName() + " impartiré la materia " + getCourse();
  }

  @Override
  public String toString() {
    return  super.toString() +
            "\ncurso ='" + course;
  }
}
