package net.rivera.clasesabstractaspoo.form.elementos;

public class TextAreaForm extends ElementoForm{
  private int rows;
  private int columns;

  public TextAreaForm(String name) {
    super(name);
  }

  public TextAreaForm(String name, int rows, int columns) {
    super(name);
    this.rows = rows;
    this.columns = columns;
  }

  public Integer getRows() {
    return rows;
  }

  public void setRows(Integer rows) {
    this.rows = rows;
  }

  public Integer getColumns() {
    return columns;
  }

  public void setColumns(Integer columns) {
    this.columns = columns;
  }

  @Override
  public String drawHtml() {
    return "<textarea name='" + this.name +
            "' cols='" + this.columns +
            "' rows='" + this.rows +
            "'>" + this.value + "</textarea>";
  }
}
