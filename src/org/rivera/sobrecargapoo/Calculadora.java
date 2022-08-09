package org.rivera.sobrecargapoo;

public class Calculadora {
  //En la sobre carga de métodos lo que importa es el tipo de datos
  //Nota: Puedo hacer todos los métodos "static" ya que no ocupo instancear para usarlos
  public int sumar(int a, int b) {
    return a + b;
  }
  //"int... args" - n cantidad de argumentos, los argumentos están en un arreglo
  public int sumar(int... args) {
    int total = 0;
    for(int a: args) {
      total += a;
    }
    return total;
  }
  //Puedo combinar con otros argumentos
  public float sumar(float arf, int... args) {
    float total = arf;
    for(int a: args) {
      total += a;
    }
    return total;
  }

  public double sumar(double... varargs) {
    double total = 0.0;
    for(double a: varargs) {
      total += a;
    }
    return total;
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
