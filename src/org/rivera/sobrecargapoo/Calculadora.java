package org.rivera.sobrecargapoo;

public class Calculadora {
  //En la sobre carga de métodos lo que importa es el tipo de datos
  public int sumar(int a, int b) {
    return a + b;
  }

  public float sumar(float a, float b) {
    return a + b;
  }

  public float sumar(int a, float b) {
    return a + b ;
  }

  public float sumar(float a, int b) {
    return a + b ;
  }

  public double sumar(double a, double b) {
    return a + b ;
  }

  public int sumar(String a, String b) {
    int res;
    try {
      res = Integer.parseInt(a) + Integer.parseInt(b);
    } catch(NumberFormatException e) {
      res = 0;
    }
    return res;
  }

  public int sumar(int a, int b, int c) {
    return a + b + c;
  }
}
