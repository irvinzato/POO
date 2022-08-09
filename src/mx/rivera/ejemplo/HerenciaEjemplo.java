package mx.rivera.ejemplo;
import mx.rivera.herenciapoo.*;

public class HerenciaEjemplo {
  public static void main(String[] args) {
    Alumno mauricio = new Alumno();
    mauricio.setName("Mauricio");
    mauricio.setLastName("Silva");
    mauricio.setNameSchool("UAM");
    mauricio.setNoteMaths(8.8);
    mauricio.setNoteProgramming(9.8);
    mauricio.setNoteHistory(7.8);

    AlumnoInternacional jenyInter = new AlumnoInternacional();
    jenyInter.setName("Jeny");
    jenyInter.setLastName("Gosling");
    jenyInter.setCountry("Alemania");
    jenyInter.setAge(30);
    jenyInter.setNameSchool("Alemania TEC");
    jenyInter.setNoteLanguages(10);
    jenyInter.setNoteProgramming(7);
    jenyInter.setNoteMaths(7.5);
    jenyInter.setNoteHistory(9.5);

    Profesor irving = new Profesor();
    irving.setName("Irving");
    irving.setLastName("Rivera");
    irving.setCourse("Matematicas");

    System.out.println("Alumno: " + mauricio.getName() + " " + mauricio.getLastName() + ", escuela: " + mauricio.getNameSchool());
    System.out.println("Alumno internacional: " + jenyInter.getName() + " " + jenyInter.getLastName() + ", escuela: " +
            jenyInter.getNameSchool() + ", pais: " + jenyInter.getCountry());
    System.out.println("Profesor: " + irving.getName() + " " + irving.getLastName() + ", materia: " + irving.getCourse());

    //Para observar las clases padre e hijo
    Class classStudentInter = jenyInter.getClass();
    while( classStudentInter.getSuperclass() != null ) {
      String daughter = classStudentInter.getName();
      String father = classStudentInter.getSuperclass().getName();
      System.out.println("Hija: " + daughter + " es una clase hija de la clase padre " + father);
      classStudentInter = classStudentInter.getSuperclass();
    }

  }
}
