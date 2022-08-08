package com.rivera.app.hogar;

public class Persona {
  //Si dejo como "default" alguna variable, clase, etc. No se podrá acceder a ella aun que importe en mi otra clase fuera de este mismo paquete
  private String name;
  private String lastName;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String cleanWater() {
    return "Limpiando agua de tortuga";
  }
}
