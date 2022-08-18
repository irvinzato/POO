package pfs.rivera.api.stream.ejemplos.models;

public class Usuario {
  private Integer id;
  private static int lastID;
  private String name;
  private String lastName;

  public Usuario(String name, String lastName) {
    this.id = ++this.lastID;
    this.name = name;
    this.lastName = lastName;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  @Override
  public String toString() {
    return "name = " + name +
            ", lastName = " + lastName;
  }
}
