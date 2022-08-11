package net.rivera.clasesabstractaspoo.form.validador;

import net.rivera.clasesabstractaspoo.form.validador.mensaje.MensajeFormateable;

public class LargoValidador extends Validador implements MensajeFormateable {
  //Con el String format se hace una extrapolación para sustituir los valores del "%d"
  protected String message = "El campo %s debe contener mínimo %d caracteres y máximo %d caracteres";
  private int min;
  private int max = Integer.MAX_VALUE;
  //De esta forma utilizo los setters para definir el mínimo o máximo según sea el caso
  public LargoValidador() {
  }

  public LargoValidador(int min, int max) {
    this.min = min;
    this.max = max;
  }

  public void setMin(int min) {
    this.min = min;
  }

  public void setMax(int max) {
    this.max = max;
  }

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
    //this.message = String.format( this.message, this.min, this.max );
    /*if( value == null ) {
      return true;
    }*/
    return ( value.length() >= this.min && value.length() <= this.max );
  }

  @Override
  public String formattableMessage(String field) {
    return String.format(this.message, field, this.min, this.max);
  }
}
