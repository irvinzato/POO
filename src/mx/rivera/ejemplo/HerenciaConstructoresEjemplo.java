package mx.rivera.ejemplo;

import mx.rivera.herenciapoo.*;

public class HerenciaConstructoresEjemplo {
  public static void main(String[] args) {
    System.out.println("======= Creando la instancia de la clase Alumno =======");
    Alumno student = new Alumno("Mauricio", "Silva", 26, "UAM");
    student.setNoteMaths(8.8);
    student.setNoteProgramming(9.8);
    student.setNoteHistory(7.8);
    student.setEmail("multizato@hotmail.com");

    System.out.println("======= Creando la instancia de la clase AlumnoInternacional =======");
    AlumnoInternacional internationalStudent = new AlumnoInternacional("Jeny", "Gosling", "Alemania");
    internationalStudent.setAge(30);
    internationalStudent.setNameSchool("Alemania TEC");
    internationalStudent.setNoteLanguages(10);
    internationalStudent.setNoteProgramming(7);
    internationalStudent.setNoteMaths(7.5);
    internationalStudent.setNoteHistory(9.5);
    internationalStudent.setEmail("jenyGos@outlook.com");

    System.out.println("======= Creando la instancia de la clase Profesor =======");
    Profesor teacher = new Profesor("Irving", "Rivera", "Matematicas");
    teacher.setAge(36);
    teacher.setEmail("irvinzato@hotmail.com");

    System.out.println("======= =======");
    toPrint( student );
    toPrint( internationalStudent );
    toPrint( teacher );
  }

  public static void toPrint( Persona person ) {
    System.out.println("Datos en común del tipo persona");
    System.out.println("Nombre: " + person.getName() + " Apellido: " + person.getLastName() +
            ", Edad: " + person.getAge() + " Email: " + person.getEmail());
    if( person instanceof Alumno ) {
      System.out.println("Datos del tipo alumno");
      System.out.println("Escuela: " + ((Alumno) person).getNameSchool());
      System.out.println("Nota matemáticas: " + ((Alumno) person).getNoteMaths());
      System.out.println("Nota programación: " + ((Alumno) person).getNoteProgramming());
      System.out.println("Nota historia: " + ((Alumno) person).getNoteHistory());

      //Porque para ser AlumnoInternacional debe ser Alumno
      if( person instanceof AlumnoInternacional ) {
        System.out.println("Datos del tipo alumno internacional");
        System.out.println("Pais: " + ((AlumnoInternacional) person).getCountry());
        System.out.println("Nota idiomas " + ((AlumnoInternacional) person).getNoteLanguages());
      }
    }

    if( person instanceof Profesor ) {
      System.out.println("Datos del tipo profesor");
      System.out.println("Materia: " + ((Profesor) person).getCourse());
    }
    System.out.println("=====================");
  }

}
