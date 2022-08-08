public class Automovil implements Comparable<Automovil> {
  //Con la variable id y lastID estatica puedo asignar un ID propio a cada objeto cuando es creado y saber cuantas tengo
  private int id;
  private String maker;
  private String model;
  private Color color = Color.GRIS;
  //Enum mas elaborado
  private TypeCar type;
  private Motor engine;
  private Tanque tank;
  private Persona driver;
  private Rueda[] wheels;
  private int indexWheels = 0;
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
    this.wheels = new Rueda[5];
  }
  //Segundo constructor
  public Automovil () {
    this.id = lastID++;
    this.wheels = new Rueda[5];
  }
  //Hago varios para tener sobre carga de constructores
  public Automovil ( String maker, String model, Color color ) {
    this.id = lastID++;
    this.maker = maker;
    this.model = model;
    this.color = color;
    this.wheels = new Rueda[5];
  }
  public Automovil ( String maker, String model, Color color, Motor engine ) {
    this.id = lastID++;
    this.maker = maker;
    this.model = model;
    this.color = color;
    this.engine = engine;
    this.wheels = new Rueda[5];
  }
  public Automovil ( String maker, String model, Color color, Motor engine, Tanque tank ) {
    this.id = lastID++;
    this.maker = maker;
    this.model = model;
    this.color = color;
    this.engine = engine;
    this.tank = tank;
    this.wheels = new Rueda[5];
  }

  public Automovil( String maker, String model, Color color, Motor engine, Tanque tank, Persona driver, Rueda[] wheels) {
    this.id = lastID++;
    this.maker = maker;
    this.model = model;
    this.color = color;
    this.engine = engine;
    this.tank = tank;
    this.driver = driver;
    this.wheels = wheels;
    this.wheels = new Rueda[5];
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
  public Motor getEngine() {
    return this.engine;
  }
  public Tanque getTank() {
    return this.tank;
  }
  public Persona getDriver() {
    return this.driver;
  }
  public Rueda[] getWheels() {
    return this.wheels;
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
  public void setEngine( Motor engine ) {
    this.engine = engine;
  }
  public void setTank( Tanque tank ) {
    this.tank = tank;
  }
  public void setDriver( Persona driver ) {
    this.driver = driver;
  }
  public void setWheels( Rueda[] wheels ) {
    this.wheels = wheels;
  }
  //Es muy común que para arreglos se implemente un método add(para agregar de uno en uno)
  public Automovil addWheel( Rueda wheel ) {
    //Para asegurar que donde se utilizara se creó un arreglo con las dimensiones adecuadas
    if( indexWheels < this.wheels.length ) {
      this.wheels[ indexWheels++ ] = wheel;
    }
    return this;
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
    String detail = "ID = " + this.id +
            "\nmaker = " + this.maker +
            "\nmodel = " + this.model;
    //Para proteger si algún valor no lo llenaron y es nulo, otra solución es dar un valor por defecto
        if( this.getType() != null ) {
          detail += "\ntipo = " + this.getType().getName();
        }
        detail += "\ncolor = " + this.color.getColor() +
          "\ndisplacement = " + this.engine.getCylinders() +
          "\npatenteColor = " + Automovil.patentColor.getColor();
    return detail;
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
    return km/(this.tank.getCapacity()*percentage);
  }

  public float calculateConsumption( int km, int percentage ) {
    return km/(this.tank.getCapacity()*(percentage/100f));
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
            ", displacement=" + engine.getCylinders() +
            ", tankCapacity=" + tank.getCapacity() +
            '}';
  }

  //Ordeno por fabricante, puedo elegir el argumento por el que me interesa ordenar
  @Override
  public int compareTo( Automovil a ) {
    return this.maker.compareTo( a.maker );
  }
}
