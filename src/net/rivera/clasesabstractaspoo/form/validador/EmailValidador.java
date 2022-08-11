package net.rivera.clasesabstractaspoo.form.validador;

public class EmailValidador extends Validador{

  protected String message = "Debe ser un formato de email";
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
