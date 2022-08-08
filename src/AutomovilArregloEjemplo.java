import java.util.Arrays;

public class AutomovilArregloEjemplo {
  public static void main(String[] args) {
    Automovil nissan = new Automovil("Nissan", "Sony");
    Persona conductorNissan = new Persona( "Angeles", "Lopez" );
    nissan.setDriver( conductorNissan );
    nissan.setTank( new Tanque(50) );
    nissan.setColor(Color.BLANCO);
    nissan.setEngine( new Motor( 2.5, TipoMotor.BENCINA ) );
    nissan.setType( TypeCar.HATCHBACK );

    Persona conductorToyota = new Persona( "Jade", "Lopez" );
    Automovil toyota = new Automovil("Toyota", "Raize", Color.BLANCO, new Motor( 4.0, TipoMotor.DIESEL ), new Tanque(), conductorToyota, null);
    toyota.setType( TypeCar.CONVERTIBLE );

    Persona conductorSubaru = new Persona( "Irving", "Rivera" );
    Automovil subaru = new Automovil("Subaru","Impreza");
    Rueda[] ruedasSubaru = new Rueda[5];
    for( int i = 0; i < ruedasSubaru.length; i++ ){
      subaru.addWheel( new Rueda("Yokohama", 16, 7.5) );
    }
    subaru.setDriver( conductorSubaru );
    subaru.setType( TypeCar.COUPE );
    subaru.setEngine( new Motor( 5.3, TipoMotor.DIESEL ) );
    subaru.setTank( new Tanque() );

    Persona conductorSuzuki = new Persona( "Jesus", "Rivera" );
    Automovil suzuki = new Automovil("Suzuki","Vitara", Color.AMARILLO, new Motor( 4.5, TipoMotor.BENCINA ), new Tanque(), conductorSuzuki, null );
    suzuki.setType( TypeCar.SUV );

    Automovil audi = new Automovil("Audi", "A3");
    audi.setDriver( conductorSubaru );
    audi.setTank( new Tanque());
    audi.setEngine( new Motor( 1.5, TipoMotor.DIESEL ) );

    //Arreglo de objetos
    Automovil[] autos = new Automovil[5];
    autos[0] = subaru;
    autos[1] = toyota;
    autos[2] = nissan;
    autos[3] = suzuki;
    autos[4] = audi;

    System.out.println("Arreglo de automoviles");
    //Para poder utilizar el sort en Objetos debemos implementar un contrato y usar "implements Comparable" en clase Automovil
    Arrays.sort(autos);
    for (Automovil auto : autos) {
      System.out.println(auto);
    }

  }
}
