package ru.rivera.interfacespoo.imprenta;

import ru.rivera.interfacespoo.imprenta.modelo.Curriculum;
import ru.rivera.interfacespoo.imprenta.modelo.Hoja;
import ru.rivera.interfacespoo.imprenta.modelo.Informe;

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

  }
  //Cualquier objeto que sea hijo de hoja podrá pasar por este método
  public static void toPrint(Hoja printable) {
    System.out.println(printable.toPrint());
  }
}
