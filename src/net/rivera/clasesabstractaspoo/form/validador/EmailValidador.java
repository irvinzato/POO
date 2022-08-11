package net.rivera.clasesabstractaspoo.form.validador;

public class EmailValidador extends Validador{

  protected String message = "El campo %s tiene un formato de correo invalido";
  private final static String EMAIL_REGEX = "^(.+)@(.+)$";

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
    return value.matches( EMAIL_REGEX );
  }
}
