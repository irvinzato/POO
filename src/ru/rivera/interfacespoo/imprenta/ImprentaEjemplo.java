package ru.rivera.interfacespoo.imprenta;

import ru.rivera.interfacespoo.imprenta.modelo.*;
import static ru.rivera.interfacespoo.imprenta.modelo.Genero.*;

public class ImprentaEjemplo {
  public static void main(String[] args) {
    Curriculum cv = new Curriculum("Resumen laboral...", "Irving Rivera", "Programador");
    cv.addExperience("JavaScript")
      .addExperience("Angular")
      .addExperience("Node")
      .addExperience("HTML/CSS")
      .addExperience("MongoDB")
      .addExperience("Java")
      .addExperience("Spring");

    Informe report = new Informe("Contenido del informe...", "Joaquin", "Buda");

    toPrint(cv);
    toPrint(report);

    Libro library = new Libro("Frank", "Historia de frameworks", PROGRAMACION);
    library.addPage(new Pagina("Historia sobre Angular..."))
            .addPage(new Pagina("Historia de Spring..."))
            .addPage(new Pagina("Historia de React..."))
            .addPage(new Pagina("Historia de Vue"));

    System.out.println("=========== LIBRO ===========");
    toPrint(library);

  }
  //Cambio Hoja por Imprimible para que no necesariamente se imprima una hoja, puede ser algo más
  public static void toPrint(Imprimible printable) {
    System.out.println(printable.toPrint());
  }
}
