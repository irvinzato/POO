package ru.rivera.interfacespoo.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja{
  private String person;
  private String graduate;
  private List<String> experiences;

  public Curriculum(String content, String person, String graduate) {
    super(content);
    this.person = person;
    this.graduate = graduate;
    this.experiences = new ArrayList<>();
  }

  public Curriculum addExperience(String exp) {
    this.experiences.add(exp);
    return this;
  }

  @Override
  public String toPrint() {
    StringBuilder sb = new StringBuilder("Nombre: ");
    sb.append(this.person).append("\n")
      .append("Resumen: ").append(this.content).append("\n")
      .append("Carrera: ").append(this.graduate).append("\n")
      .append("Experiencias: \n");
    for(String exp: this.experiences) {
      sb.append("- ").append(exp).append("\n");
    }
    return sb.toString();
  }
}
