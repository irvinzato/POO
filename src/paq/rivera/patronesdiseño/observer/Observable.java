package paq.rivera.patronesdiseño.observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Observable {
  //Un Observable puede tener muchos observadores
  protected List<Observer> observers = new ArrayList<>();

  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  //En esa ocasión "Observer" es una interfaz, pero en la clase que lo implemente debe tener el "equals"
  public void remove(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObserver(){
    for( Observer obs: this.observers ) {
      obs.update(this); //Cada observador tendrá ese método, le paso una instancia de "Observable"
    }
  }
}
