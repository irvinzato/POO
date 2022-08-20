package paq.rivera.patronesdiseño.composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente{

  private List<Componente> sons;

  public Directorio(String name) {
    super(name);
    this.sons = new ArrayList<>();
  }

  public Directorio addComponent(Componente comp) {
    this.sons.add(comp);
    return this;  //Para poder encadenar
  }

  //Para poder eliminar el objeto debemos implementar el método "equals" para implementar la regla de búsqueda
  public void deleteComponent(Componente comp) {
    sons.remove(comp);
  }

  //Método recursivo, parecido a los ejemplos de "decorator"
  @Override
  public String show(int level) {
    StringBuilder sb = new StringBuilder("\t".repeat(level));
    sb.append(name)
            .append("/")
            .append("\n");
    for(Componente son: this.sons) {
      sb.append(son.show(level + 1));
      if( son instanceof Archivo ) {
        sb.append("\n");
      }
    }
    return sb.toString();
  }

  @Override
  public boolean search(String name) {
    if( this.name.equalsIgnoreCase(name) ) { //Primero válido con el nombre del directorio
      return true;
    }
    for( Componente son: this.sons ) {     //Si no es, aplico recursividad en cada uno de los hijos
      if( son.search(name) ) {
        return true;
      }
    }
    //El for lo puedo cambiar usando él API Stream, quedaría:
    //return sons.stream().anyMatch( s -> s.search(name) );
    return false;
  }

}
