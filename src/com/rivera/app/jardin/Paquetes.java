package com.rivera.app.jardin;
import com.rivera.app.hogar.*;

public class Paquetes {
  public static void main(String[] args) {
    Persona person = new Persona();
    person.setName("Irving");
    person.setLastName("Rivera");
    System.out.println("Nombre de persona: " + person.getName());

    Perro dog = new Perro();
    dog.name = "Almendra";
    System.out.println("Nombre de compañera: " + dog.name);

    //Cuando la clase está en el mismo paquete no es necesario importar nada
    Tortuga turtle = new Tortuga();
    turtle.name = "Tortugini";
    turtle.race = "China";

    String waiting = turtle.wait( person );
    System.out.println("Esperando - " +waiting);

  }
}
