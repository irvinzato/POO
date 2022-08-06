public class Automovil {
  //La idea es que maneje datos la clase y los retorne... this hace referencia a los atributos de la clase
  private String maker;
  private String model;
  private String color = "Blanco";
  private double displacement;
  private int tankCapacity = 40;

  //Métodos GET para obtener valores privados
  public String getMaker() {
    return this.maker;
  }
  public String getModel() {
    return this.model;
  }
  public String getColor() {
    return this.color;
  }
  public double getDisplacement() {
    return this.displacement;
  }
  public int getTankCapacity() {
    return this.tankCapacity;
  }

  //Métodos SET para actualizar valores
  public void setMaker( String maker ) {
    this.maker = maker;
  }
  public void setModel( String model ) {
    this.model = model;
  }
  public void setColor( String color ) {
    this.color = color;
  }
  public void setDisplacement( double displacement ) {
    this.displacement = displacement;
  }
  public void setTankCapacity( int tankCapacity ) {
    this.tankCapacity = tankCapacity;
  }

  public String detail() {
    //Con "this" hace referencia a sí mismo dentro de la clase(avaces se puede omitir, depende la situación)
    String maker = "Por definir";
    return  "maker = " + this.maker +
            "\nmodel = " + this.model +
            "\ncolor = " + this.color +
            "\ndisplacement = " + this.displacement;
  }

  public String speedUp( int rpm ) {
    return "El auto " + this.maker + " acelerando a " + rpm + " rpm";
  }

  public String stop() {
    return this.maker + " " + this.model + " frenando";
  }

  public String speedUpStop( int rpm ) {
    String speedUp = this.speedUp( rpm );
    String stop = this.stop();
    return speedUp + "\n" + stop;
  }

  //Esto es SOBRE CARGA de métodos. Mismo nombre de método pero diferentes parámetros que recibe
  public float calculateConsumption( int km, float percentage ) {
    return km/(tankCapacity*percentage);
  }

  public float calculateConsumption( int km, int percentage ) {
    return km/(tankCapacity*(percentage/100f));
  }

}
