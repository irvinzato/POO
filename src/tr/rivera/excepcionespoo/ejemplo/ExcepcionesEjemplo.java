package tr.rivera.excepcionespoo.ejemplo;

import javax.swing.*;

public class ExcepcionesEjemplo {
  public static void main(String[] args) {

    String value = JOptionPane.showInputDialog("Ingresa un entero: ");
    int divisor;

    try {  //Tiene que estar dentro del contexto todos los errores que puedan ocurrir
      divisor = Integer.parseInt(value);
      int div = 10 / divisor;
      System.out.println(div);
    } catch (NumberFormatException nfe) { //Puedo tener múltiples catch
      System.out.println("Error, ingresaste un valor que no es entero: " + nfe.getMessage() );
      main( args ); //En lugar de finalizar puedo volver a ejecutar
    } catch(ArithmeticException ae) { //Pudiera usar la clase más genérica "Excepcion" pero es bueno ser específicos
      System.out.println("Capturando la excepción en tiempo de ejecución " + ae.getMessage());
    } finally {  //Es opcional y típicamente es para cerrar recursos(Como una conexión a base de datos)
      System.out.println("Finally opcional, se ejecuta siempre, con o sin excepción");
    }

    System.out.println("Continuando con el flujo de la aplicación");

  }
}
