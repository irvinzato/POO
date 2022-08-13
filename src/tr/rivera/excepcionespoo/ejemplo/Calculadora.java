package tr.rivera.excepcionespoo.ejemplo;

public class Calculadora {
  //Esté método personalizo una posible excepción y la tenemos que propagar, por eso el "throws"
  public double divide(int numerator, int divider) throws PersonalizacionExcepcion {
    if( divider == 0 ) {
      throw new PersonalizacionExcepcion("División por cero !, mensaje personalizado");
    }
    return (double) numerator / divider;
  }

  //Sobre carga de métodos, reutilizando el método de arriba, manejando 2 excepciones personalizadas
  public double divide(String numerator, String divider) throws PersonalizacionExcepcion,
                                                          FormatoNumeroExcepcion {
    try {
      int num = Integer.parseInt(numerator);
      int div = Integer.parseInt(divider);
      return this.divide(num, div);
    } catch(NumberFormatException nfe) {
      throw new FormatoNumeroExcepcion("Debe ingresar un número en el numerador y divisor " +
              "coloro numerador: " + numerator + " y divisor: " + divider);
    }
  }
}
