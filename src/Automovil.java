public class Automovil {
  //La idea es que maneje datos la clase y los retorne... this hace referencia a los atributos de la clase
  private String maker;
  private String model;
  private String color = "Blanco";
  private double displacement;
  private int tankCapacity = 40;

  //Constructor(Podría tener más de 1 constructor por alguna razón)
  //"this()" hace referencia al constructor de la clase
  public Automovil( String maker, String model ) {
    this.maker = maker;
    this.model = model;
  }
  //Segundo constructor
  public Automovil () {}
  //Hago varios para tener sobre carga de constructores
  public Automovil ( String maker, String model, String color ) {
    this.maker = maker;
    this.model = model;
    this.color = color;
  }
  public Automovil ( String maker, String model, String color, double displacement ) {
    this.maker = maker;
    this.model = model;
    this.color = color;
    this.displacement = displacement;
  }
  public Automovil ( String maker, String model, String color, double displacement, int tankCapacity ) {
    this.maker = maker;
    this.model = model;
    this.color = color;
    this.displacement = displacement;
    this.tankCapacity = tankCapacity;
  }

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
    //Con "this" hace referencia a sí mismo dentro de la clase(aveces se puede omitir, depende la situación)
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

  //No es necesaria la etiqueta pero la uso para distinguir que modifique un método de la clase padre
  @Override
  public boolean equals( Object obj ) {
    //Para obligar que compare el mismo objeto y si trata de comparar con otro objeto no de error
    if( !(obj instanceof Automovil) ) {
      return false;
    }
    Automovil car = (Automovil) obj;
    //Puedo tener fabricante y modelos null por eso siempre hay que validar lo que puede pasar
    return ( this.maker != null && this.model != null &&
            this.maker.equals(car.getMaker()) && this.model.equals(car.getModel()) );
  }


}
