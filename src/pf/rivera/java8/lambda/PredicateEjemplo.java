package pf.rivera.java8.lambda;

import pf.rivera.java8.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateEjemplo {
  public static void main(String[] args) {
    //Siempre retorna un boolean y solo recibe los genéricos a usar
    Predicate<Integer> test = num -> num > 10;
    boolean result = test.test(7);
    System.out.println("Resultado del primer test: " + result);
    //Se pueden simplificar las implementaciones
    Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
    System.out.println("Resultado del segundo test: " + test2.test("ROLE_ADMIN"));

    BiPredicate<String, String> test3 = (a, b) -> a.equals(b);
    System.out.println("Resultado del tercer test: " + test3.test("shiva","raiden"));

    BiPredicate<Integer, Integer> test4 = (a, b) -> a > b;
    System.out.println("Resultado del cuarto test: " + test4.test(6,3));

    Usuario user1 = new Usuario();
    Usuario user2 = new Usuario();
    user1.setName("Beltran");
    user2.setName("Bernal");
    BiPredicate<Usuario, Usuario> test5 = (u1, u2) -> u1.getName().equals(u2.getName());
    System.out.println("Resultado del quinto test: " + test5.test(user1, user2));

  }
}
