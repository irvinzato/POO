package paq.rivera.patronesdiseño.observer.ejemplos;

import paq.rivera.patronesdiseño.observer.UsuarioRepositorio;
//Simulo que cada que se crea un nuevo usuario notifico
public class ObserverUsuarioEjemplo {
  public static void main(String[] args) {

    UsuarioRepositorio repo = new UsuarioRepositorio();
    repo.addObserver(observable -> System.out.println("Enviando un email al usuario"));
    repo.addObserver(observable -> System.out.println("Enviando un email al administrador"));
    repo.addObserver(observable -> System.out.println("Guardando info del usuario en logs"));

    repo.createUser("Irvinzato");

  }
}
