package paq.rivera.patronesdiseño.observer;

//PRIMER EJEMPLO
public class Corporacion extends Observable {
  private String name;
  private double price;

  public Corporacion(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public void modifyPrice(double price) {
    this.price = price;
    notifyObserver(); //Para notificar a todos los observadores
  }

  @Override
  public String toString() {
    return getName() + " nuevo precio: " + getPrice();
  }
}
