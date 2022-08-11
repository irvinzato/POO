package net.rivera.clasesabstractaspoo.form.validador;

public class NoNuloValidador extends Validador{
  protected String message = "El campo no puede ser nulo";

  @Override
  public String getMessage() {
    return this.message;
  }

  @Override
  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean isValid(String value) {
    return (value != null);
  }
}
