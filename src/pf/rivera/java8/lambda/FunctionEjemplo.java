package pf.rivera.java8.lambda;

import pf.rivera.java8.lambda.models.Usuario;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionEjemplo {
  public static void main(String[] args) {
    //Un "Function" es una combinación entré en "Consumer" y "Supplier" - <"valor que recibe", "lo que retorna">
    Function<String, String> function1 = param -> "Hola desde función 1 " + param;
    String result = function1.apply("Irving"); //Método para ejecutar la implementación
    System.out.println(result);

    Function<String, String> function2 = String::toUpperCase; //Ó "param -> param.toUpperCase();"
    System.out.println( function2.apply("función numero 2") );

    BiFunction<String, String, String> function3 = (arg1, arg2) -> arg1.toUpperCase().concat(" " +arg2.toUpperCase());
    String result2 = function3.apply("padre","zeus");
    System.out.println(result2);

    BiFunction<String, String, Integer> function4 = (a, b) -> a.compareTo(b); //devuelve 0 si son cadenas iguales
    System.out.println( function4.apply("iguales","iguales") );


  }
}
