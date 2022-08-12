package ro.rivera.interfacesgenericaspoo.modelo;

//Cualquier atributo en común del modelo puede estar en esta clase base
public class BaseEntity {
  protected Integer id;
  private static int lastId;

  public BaseEntity() {
    this.id = ++lastId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}
