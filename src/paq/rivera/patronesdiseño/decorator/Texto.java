package paq.rivera.patronesdiseño.decorator;

public class Texto implements Formateable{

  private String text;

  public Texto(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  @Override
  public String format() {
    return getText();
  }

}
