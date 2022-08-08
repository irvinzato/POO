package com.rivera.app.jardin;

import com.rivera.app.hogar.Persona;

//Nota: public - Se puede acceder en cualquier parte de la aplicación
//      default - Solo se puede acceder para las clases que están dentro del mismo paquete
//      protected - Las clases que están dentro del mismo paquete y también en las clases hijas
//      private - Solo se puede acceder dentro de la misma clase(Por eso la importancia de get y set)
public class Tortuga {
  //En este caso si tengo algún atributo, clase, etc. "default" si lo puedo utilizar porque está dentro del mismo package(contexto)
  //También puedo usar "protected" se utiliza para herencia de atributos o para acceder a ellos dentro del mismo paquete
  protected String name;
  protected String race;

  String wait( Persona persona ) {
    return persona.cleanWater();
  }


}
