public class Automovil {
  //Con la variable id y lastID estatica puedo asignar un ID propio a cada objeto cuando es creado y saber cuantas tengo
  private int id;
  private String maker;
  private String model;
  //Puedo parametrizar usando ENUMS o con constantes "final" pero queda mejor con los enums
  private Color color = Color.GRIS;
  //Enum mas elaborado
  private TypeCar type = TypeCar.SEDAN;
  private double displacement;
  private int tankCapacity = 40;
  //Un "static" no le pertenece a la instancia, no es del objeto, es de la clase. No ocupa el "this", pero puede usar el nombre de la clase, en método detail lo uso
  //Siempre un atributo "static" debe ir de la mano con método "static" y biceversa
  private static Color patentColor = Color.AZUL;
  private static int tankCapacityStatic = 30;
  private static int lastID;
  //"final" son atributos constantes
  public static final Integer MAXIMUM_HIGHWAY_SPEED = 120;
  public static final Integer MAXIMUM_CITY_SPEED = 60;

  //Constructor(Podría tener más de 1 constructor por alguna razón)
  //"this()" hace referencia al constructor de la clase
  public Automovil( String maker, String model ) {
    this.id = lastID++;
    this.maker = maker;
    this.model = model;
  }
  //Segundo constructor
  public Automovil () {
    this.id = lastID++;
  }
  //Hago varios para tener sobre carga de constructores
  public Automovil ( String maker, String model, Color color ) {
    this.id = lastID++;
    this.maker = maker;
    this.model = model;
    this.color = color;
  }
  public Automovil ( String maker, String model, Color color, double displacement ) {
    this.id = lastID++;
    this.maker = maker;
    this.model = model;
    this.color = color;
    this.displacement = displacement;
  }
  public Automovil ( String maker, String model, Color color, double displacement, int tankCapacity ) {
    this.id = lastID++;
    this.maker = maker;
    this.model = model;
    this.color = color;
    this.displacement = displacement;
    this.tankCapacity = tankCapacity;
  }

  //Métodos GET para obtener valores privados
  public int getId() {
    return this.id;
  }
  public String getMaker() {
    return this.maker;
  }
  public String getModel() {
    return this.model;
  }
  public Color getColor() {
    return this.color;
  }
  public TypeCar getType() {
    return this.type;
  }
  public double getDisplacement() {
    return this.displacement;
  }
  public int getTankCapacity() {
    return this.tankCapacity;
  }
  public static Color getPatentColor() {
    return patentColor;
  }
  public static int getTankCapacityStatic() {
    return Automovil.tankCapacityStatic;
  }
  public static int getLastID() {
    return Automovil.lastID;
  }


  //Métodos SET para actualizar valores
  public void setMaker( String maker ) {
    this.maker = maker;
  }
  public void setModel( String model ) {
    this.model = model;
  }
  public void setColor( Color color ) {
    this.color = color;
  }
  public void setType( TypeCar type ) {
    this.type = type;
  }
  public void setDisplacement( double displacement ) {
    this.displacement = displacement;
  }
  public void setTankCapacity( int tankCapacity ) {
    this.tankCapacity = tankCapacity;
  }
  public static void setPatentColor( Color patentColor ) {
    Automovil.patentColor = patentColor;
  }
  public static void setTankCapacityStatic( int tankCapacityStatic ) {
    Automovil.tankCapacityStatic = tankCapacityStatic;
  }

  public String detail() {
    //Con "this" hace referencia a sí mismo dentro de la clase(aveces se puede omitir, depende la situación)
    String maker = "Por definir";
    return  "ID = " + this.id +
            "\nmaker = " + this.maker +
            "\nmodel = " + this.model +
            "\ntipo = " + this.getType().getName() +
            "\ncolor = " + this.color.getColor() +
            "\ndisplacement = " + this.displacement +
            "\npatenteColor = " + Automovil.patentColor.getColor();
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
  //Este método es estatico y usa variables que se pasan por referencia o estaticas, otro tipo no dejara usar
  public static float calculateConsumptionStatic( int km, int percentage ) {
    return km/(Automovil.tankCapacityStatic*(percentage/100f));
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
  //atajo - click derecho, generate...
  @Override
  public String toString() {
    return "Automovil{" +
            "maker='" + maker + '\'' +
            ", model='" + model + '\'' +
            ", color='" + color.getColor() + '\'' +
            ", displacement=" + displacement +
            ", tankCapacity=" + tankCapacity +
            '}';
  }

  //Un "static" no le pertenece a la instancia, no es del objeto, es de la clase


}
