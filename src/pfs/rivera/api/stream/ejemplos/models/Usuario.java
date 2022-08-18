package pfs.rivera.api.stream.ejemplos.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {
  private Integer id;
  private static int lastID;
  private String name;
  private String lastName;

  private List<Factura> bills;

  public Usuario(String name, String lastName) {
    this.id = ++this.lastID;
    this.name = name;
    this.lastName = lastName;
    this.bills = new ArrayList<>();
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

  public List<Factura> getBills() {
    return bills;
  }
  //En lugar de set, es add para listas
  public void addBill(Factura bill) {
    this.bills.add(bill);
    bill.setUser(this); //Además de agregar factura, en la factura añado al Usuario
  }

  @Override
  public String toString() {
    return "name = " + name +
            ", lastName = " + lastName;
  }

  //Para que no deje crear objetos con la misma información
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Usuario usuario = (Usuario) o;
    return Objects.equals(name, usuario.name) && Objects.equals(lastName, usuario.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, lastName);
  }
}
