package net.rivera.clasesabstractaspoo.form.validador.mensaje;

public interface MensajeFormateable {
  //Cualquier clase que implementa esta interfaz tiene que implementar el método, para una forma más genérica
  //Parecido a una clase abstracta pero no permite que ningún método esté implementado, todos son públicos o default
  //Son métodos que pueden tener muchas clases aun que se realicen de forma diferente y puede haber herencia multiples de interfaces
  public String formattableMessage(String field);
}
