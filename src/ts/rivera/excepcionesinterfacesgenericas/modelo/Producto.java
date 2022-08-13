package ts.rivera.excepcionesinterfacesgenericas.modelo;

public class Producto extends BaseEntity {
  private String desc;
  private Double price;

  public Producto(String desc, double price) {
    super();
    this.desc = desc;
    this.price = price;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "id = " + id +
            ", descripción = '" + desc + '\'' +
            ", precio = " + price;
  }
}
