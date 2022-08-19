package rec.rivera.recursividad.ejemplo.models;

import java.util.ArrayList;
import java.util.List;

public class Componente {
  private String name;
  private List<Componente> listComponents;
  private int level; //Utilizado para el método recursivo Java8

  public Componente(String name) {
    this.listComponents = new ArrayList<>();
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Componente> getListComponents() {
    return listComponents;
  }

  public void setListComponents(List<Componente> listComponents) {
    this.listComponents = listComponents;
  }

  public Componente addComponent(Componente component) { //Para encadenar el método, si no pudiera ser void
    this.listComponents.add(component);
    return this;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public boolean hasChildren() {
    return !this.listComponents.isEmpty();
  }



}
