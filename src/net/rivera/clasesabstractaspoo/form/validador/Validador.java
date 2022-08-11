package net.rivera.clasesabstractaspoo.form.validador;

abstract public class Validador {
  protected String message;

  abstract public String getMessage();
  abstract public void setMessage(String message);
  abstract public boolean isValid(String value);

}
