package com.rivera.app.hogar;

import com.rivera.app.jardin.Tortuga;
//También puedo usarlo dentro del mismo contexto
import static com.rivera.app.hogar.Persona.greet;

public class Hogar {
  public static void main(String[] args) {
    Persona person = new Persona();
    //Puedo utilizar la clase Tortuga pero no sus elementos "default o protected" porque son restringidos
    Tortuga turtle = new Tortuga();
    String greetin = greet();


  }
}
