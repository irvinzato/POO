package paq.rivera.patronesdiseño.decoratorcafeejemplo.decorador;

import paq.rivera.patronesdiseño.decoratorcafeejemplo.Configurable;

abstract public class CafeDecorador implements Configurable {
  protected Configurable coffee;    //Porque la clase "Cafe" implementa "Configurable" por eso es la más genérica

  public CafeDecorador(Configurable coffee) {
    this.coffee = coffee;
  }

}
