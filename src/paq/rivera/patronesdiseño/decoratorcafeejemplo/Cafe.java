package paq.rivera.patronesdiseño.decoratorcafeejemplo;

public class Cafe implements Configurable{
  private float price;
  private String name;

  public Cafe(float price, String name) {
    this.price = price;
    this.name = name;
  }

  //Cuanto creo la instancia de esta clase tengo el precio base e ingrediente con el que parte
  @Override
  public float getPriceBase() {
    return this.price;
  }

  @Override
  public String getIngredients() {
    return this.name;
  }
}
