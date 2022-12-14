package mx.rivera.ejemplo;

import mx.rivera.herenciapoo.*;

public class HerenciaToStringEjemplo {
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

    toPrint( student );
    toPrint( internationalStudent );
    toPrint( teacher );
  }

  public static void toPrint( Persona person ) {
    //Invocación de método "toString" correspondiente a cada instancia, en estos casos no es necesario distinguir el objeto
    System.out.println("======= =======");
    System.out.println(person);
  }

}
