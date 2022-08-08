package com.rivera.app.hogar;

import com.rivera.app.jardin.Tortuga;

public class Hogar {
  public static void main(String[] args) {
    Persona person = new Persona();
    //Puedo utilizar la clase Tortuga pero no sus elementos "default o protected" porque son restringidos
    Tortuga turtle = new Tortuga();

  }
}
