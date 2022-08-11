package net.rivera.clasesabstractaspoo.form.validador;

public class NoNuloValidador extends Validador{
  //Al utilizar "%s" es para optimizar el código y concatenar el campo en el momento que agrego el mensaje
  protected String message = "El campo %s no puede ser nulo";

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
