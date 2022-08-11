package net.rivera.clasesabstractaspoo.form.validador;

public class NumeroValidador extends Validador{
  protected String message = "Debe ser un numero";

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
    try {
      Integer.parseInt(value);
      return true;
    } catch(NumberFormatException e) {
      return false;
    }
  }
}
