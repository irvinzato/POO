package net.rivera.clasesabstractaspoo.form.elementos;
import net.rivera.clasesabstractaspoo.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{
  private List<Opcion> options;

  public SelectForm(String name) {
    super(name);
    this.options = new ArrayList<Opcion>();
  }

  public SelectForm(String name, List<Opcion> options) {
    super(name);
    this.options = options;
  }
  //Pongo de retorno "SelectForm" para poder usar el método de forma encadenada
  public SelectForm addOption(Opcion option) {
    this.options.add(option);
    return this;
  }

  @Override
  public String drawHtml() {
    StringBuilder sb = new StringBuilder("<select ");
    sb.append("name='")
        .append(this.name)
        .append("'>");

    for(Opcion opt: this.options) {
      sb.append("\n<option value='")
        .append(opt.getValue())
        .append("'");
      if( opt.isSelected() ) {
        sb.append("selected");
        this.value = opt.getValue();
      }
      sb.append(">")
        .append(opt.getName())
        .append("</option>");
    }
    sb.append("</select>");
    return sb.toString();
  }
}
