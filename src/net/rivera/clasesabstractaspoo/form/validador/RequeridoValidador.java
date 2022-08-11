package net.rivera.clasesabstractaspoo.form.validador;

public class RequeridoValidador extends Validador{
  protected String message = "El campo es requerido";

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
    return (value != null && value.length() != 0);
  }
}
