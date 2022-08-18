package pfs.rivera.api.stream.ejemplos.models;

public class Factura {
  private String description;
  //Asi creo la relación inversa, en la factura también quiero al Usuario
  private Usuario user;

  public Factura(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Usuario getUser() {
    return user;
  }

  public void setUser(Usuario user) {
    this.user = user;
  }
}
