package tr.rivera.excepcionespoo.ejemplo;

public class Calculadora {
  //En esté método personalizo una posible excepción
  public double divide(int numerator, int divider) throws PersonalizacionExcepcion {
    if( divider == 0 ) {
      throw new PersonalizacionExcepcion("División por cero !, mensaje personalizado");
    }
    return (double) numerator / divider;
  }
}
