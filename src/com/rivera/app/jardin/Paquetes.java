package com.rivera.app.jardin;
import com.rivera.app.hogar.*;
//Lo mismo que con las clases, puedo usar "*" para abarcar todos los estáticos o uno por uno.
import static com.rivera.app.hogar.Persona.*;
//También funciona para los enums
import static com.rivera.app.hogar.ColorCabello.*;


public class Paquetes {
  public static void main(String[] args) {
    Persona person = new Persona();
    person.setName("Irving");
    person.setLastName("Rivera");
    person.setHairColor(NEGRO);
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

    //Con la importación "static" solo llamo el método static en lugar de "Persona.greet();"
    String greeting = greet();
    System.out.println("saludo = " + greeting);
    //Un ejemplo con importación y el otro sin
    String female = FEMALE_GENDER;
    String male = Persona.MALE_GENDER;

  }
}
