package mx.rivera.herenciapoo;

public class Persona {
  //Atributos protected en la clase padre son visibles también en toda su jerarquía
  private String name;
  private String lastName;
  private int age;
  private String email;

  public Persona() {
    System.out.println("Persona: inicializando constructor");
  }

  public Persona(String name, String lastName) {
    this.name = name;
    this.lastName = lastName;
  }

  public Persona(String name, String lastName, int age) {
    //De esta manera reutilizo el constructor que tiene 2 parámetros
    this(name, lastName);
    this.age = age;
  }

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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  //Sobre carga de métodos padre e hijos
  public String greet() {
    return "Hola que tal !";
  }
}
