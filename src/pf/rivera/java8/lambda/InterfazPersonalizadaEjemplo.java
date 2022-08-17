package pf.rivera.java8.lambda;

import pf.rivera.java8.lambda.creacionpropia.Aritmetica;
import pf.rivera.java8.lambda.creacionpropia.Calculadora;

public class InterfazPersonalizadaEjemplo {
  public static void main(String[] args) {
    Aritmetica sum = (a, b) -> a + b;
    Aritmetica subtract = (a, b) -> a - b;

    Calculadora calculate = new Calculadora();
    System.out.println("Suma: " + calculate.computer(4, 9, sum));
    System.out.println("Resta: " + calculate.computer(4, 9, subtract));
    //Creo la implementación lambda en el mismo método del objeto calculadora
    System.out.println("Multiplicar: " + calculate.computer(4, 9, (a, b) -> a * b ));

    //Con BiFunction
    System.out.println("Calculo con BiFunction(suma): " + calculate.computerBiFunction(10, 5, (a, b) -> a + b));

  }
}
