package tr.rivera.excepcionespoo.ejemplo;

import javax.swing.*;

public class CalculadoraExcepcionesEjemplo {
  public static void main(String[] args) {

    Calculadora calculator = new Calculadora();
    String value = JOptionPane.showInputDialog("Ingresa un entero: ");
    int divider;
    double divide = 0;

    try {
      divider = Integer.parseInt(value);
      divide = calculator.divide(10, divider);
    } catch (NumberFormatException nfe) {
      System.out.println("Error, ingresaste un valor que no es entero: " + nfe.getMessage() );
      main( args );
    } catch (PersonalizacionExcepcion pe) {
      System.out.println("Personalice esta excepción: " + pe.getMessage());
    }

    System.out.println("Continuando con el flujo de la aplicación " + divide);

    //SEGUNDO EJEMPLO DE PERSONALIZACIÓN DE EXCEPCIONES
    Calculadora calculatorString = new Calculadora();
    double res = 0;

    try {
      res = calculatorString.divide("fg","s");
    } catch(PersonalizacionExcepcion pe) {
      System.out.println("Primer error personalizado: " + pe.getMessage());
    } catch(FormatoNumeroExcepcion fne) {
      System.out.println("Segundo error personalizado: " + fne.getMessage());
      System.out.println("Otra forma de mostrar la excepción por traza");
      fne.printStackTrace(System.out);
    }

    System.out.println("Respuesta del segundo ejemplo " + res);





  }
}
