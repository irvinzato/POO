package com.rivera.app.hogar;

public class Persona {
  //Si dejo como "default" alguna variable, clase, etc. No se podrá acceder a ella aun que importe en mi otra clase fuera de este mismo paquete
  private String name;
  private String lastName;
  private ColorCabello hairColor;

  public static final String MALE_GENDER = "Masculino";
  public static final String FEMALE_GENDER = "Femenino";

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

  public ColorCabello getHairColor() {
    return hairColor;
  }

  public void setHairColor(ColorCabello hairColor) {
    this.hairColor = hairColor;
  }

  public String cleanWater() {
    return "Limpiando agua de tortuga";
  }

  public static String greet() {
    return "Hola, que tal";
  }
}
