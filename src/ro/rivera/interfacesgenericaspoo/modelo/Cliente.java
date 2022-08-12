package ro.rivera.interfacesgenericaspoo.modelo;

public class Cliente extends BaseEntity {
  private String name;
  private String lastName;

  public Cliente(String name, String lastName) {
    super();
    this.name = name;
    this.lastName = lastName;
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
    return "id = " + id +
            ", name = '" + name +
            ", lastName = '" + lastName ;
  }

}
