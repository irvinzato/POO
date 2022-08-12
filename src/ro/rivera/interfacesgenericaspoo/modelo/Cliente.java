package ro.rivera.interfacesgenericaspoo.modelo;

import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Cliente cliente = (Cliente) o;
    return Objects.equals(id, cliente.id);
  }
  //Este método lo implementa el "generate" de equals pero no lo uso
  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
