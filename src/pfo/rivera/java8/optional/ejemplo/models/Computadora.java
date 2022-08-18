package pfo.rivera.java8.optional.ejemplo.models;

public class Computadora {
  private String name;
  private String model;
  private Procesador processor;

  public Computadora(String name, String model) {
    this.name = name;
    this.model = model;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Procesador getProcessor() {
    return processor;
  }

  public void setProcessor(Procesador processor) {
    this.processor = processor;
  }

  @Override
  public String toString() {
    return name + " " + model;
  }
}
