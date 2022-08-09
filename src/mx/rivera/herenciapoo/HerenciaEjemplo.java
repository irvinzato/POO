package mx.rivera.herenciapoo;

public class HerenciaEjemplo {
  public static void main(String[] args) {
    Alumno mauricio = new Alumno();
    mauricio.setName("Mauricio");
    mauricio.setLastName("Silva");

    Profesor irving = new Profesor();
    irving.setName("Irving");
    irving.setLastName("Rivera");
    irving.setCourse("Matematicas");

    System.out.println("Alumno: " + mauricio.getName() + " " + mauricio.getLastName());
    System.out.println("Profesor: " + irving.getName() + " " + irving.getLastName() + ", materia: " + irving.getCourse());

  }
}
