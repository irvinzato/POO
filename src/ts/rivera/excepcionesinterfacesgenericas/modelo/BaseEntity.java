package ts.rivera.excepcionesinterfacesgenericas.modelo;

import java.util.Objects;

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

  //También reutilizo estos métodos que antes estaban en "Cliente"
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BaseEntity base = (BaseEntity) o;
    return Objects.equals(id, base.id);
  }
  //Este método lo implementa el "generate" de "equals" pero no lo uso
  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
