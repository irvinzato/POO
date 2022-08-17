package pf.rivera.java8.lambda.creacionpropia;

import java.util.function.BiFunction;

public class Calculadora {
  public double computer(double a, double b, Aritmetica lambda) { //Cualquier computo de operación aritmética
    return lambda.operation(a, b);
  }

  public double computerBiFunction(double a, double b, BiFunction<Double, Double, Double> lambda) {
    return lambda.apply(a, b);
  }

}
