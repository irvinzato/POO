package org.rivera.sobrecargapoo;

public class SobrecargaEjemplo {
  public static void main(String[] args) {
    Calculadora calculator = new Calculadora();

    System.out.println("Sumar enteros: " + calculator.sumar(12, 10));
    System.out.println("Sumar flotantes: " + calculator.sumar(12.2F, 10.6F));
    System.out.println("Sumar flotante y entero: " + calculator.sumar(12.2F, 10));
    System.out.println("Sumar entero y flotante: " + calculator.sumar(12, 10.5F));
    System.out.println("Sumar doubles: " + calculator.sumar(12.5, 10.2));
    System.out.println("Sumar strings: " + calculator.sumar("12", "10"));
    System.out.println("Sumar 3 enteros: " + calculator.sumar(12, 10, 5));
    //Selecciona el método de flotantes porque son compatibles con long
    System.out.println("Sumar longs " + calculator.sumar(10L,5L));
    //Un carácter también tiene su representación decimal por eso no truena
    System.out.println("Sumar enteros con caracter " + calculator.sumar(10, '@'));
    System.out.println("Sumar float y entero caracter " + calculator.sumar(10F,'¬'));
  }
}
