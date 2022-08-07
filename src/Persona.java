public class Persona {
  private String name;
  private String lastName;

  //No hay una regla que diga que implementar, depende de nuestras reglas de negocio y/o criterio
  public Persona(String name, String lastName) {
    this.name = name;
    this.lastName = lastName;
  }

  //Aveces no vale la pena tener get´s y set´s, con un método podemos mostrarlo
  @Override
  public String toString() {
    return "name= " + name + '\'' +
            ", lastName=" + lastName;
  }
}
