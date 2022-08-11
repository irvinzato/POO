package net.rivera.clasesabstractaspoo.form.validador;

public class EmailValidador extends Validador{

  protected String message = "Debe ser un email";

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
    if( value.contains("@") && value.contains(".") ) {
      return true;
    } else {
      return false;
    }
  }
}
