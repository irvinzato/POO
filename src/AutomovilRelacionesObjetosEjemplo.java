public class AutomovilRelacionesObjetosEjemplo {
  public static void main(String[] args) {
    Rueda[] ruedasSubaru = new Rueda[5];
    ruedasSubaru[0] = new Rueda( "Yokohama", 16, 7.5 );
    ruedasSubaru[1] = new Rueda( "Yokohama", 16, 7.5 );
    ruedasSubaru[2] = new Rueda( "Yokohama", 16, 7.5 );
    ruedasSubaru[3] = new Rueda( "Yokohama", 16, 7.5 );
    ruedasSubaru[4] = new Rueda( "Yokohama", 16, 7.5 );
    Rueda[] ruedasNissan = { new Rueda( "Michelin", 18, 10.5 ), new Rueda( "Michelin", 18, 10.5 )
                          , new Rueda( "Michelin", 18, 10.5 ), new Rueda( "Michelin", 18, 10.5 )
                          , new Rueda( "Michelin", 18, 10.5 ) };
    Rueda[] ruedasToyota = { new Rueda( "Pirelli", 20, 11.5 ), new Rueda( "Pirelli", 20, 11.5 )
                          , new Rueda( "Pirelli", 20, 11.5 ), new Rueda( "Pirelli", 20, 11.5 )
                          , new Rueda( "Pirelli", 20, 11.5 ) };
    Persona conductorSubaru = new Persona( "Irving", "Rivera" );
    Persona conductorNissan = new Persona( "Angeles", "Lopez" );
    Persona conductorToyota = new Persona( "Jade", "Lopez" );
    Persona conductorSubaru2 = new Persona( "Jesus", "Rivera" );
    Automovil nissan = new Automovil("Nissan", "Sony");
    Automovil toyota = new Automovil("Toyota", "Raize", Color.BLANCO, new Motor( 4.0, TipoMotor.DIESEL ), new Tanque(), conductorToyota, ruedasToyota);
    Automovil subaru = new Automovil("Subaru","Impreza");
    Automovil subaru2 = new Automovil("Subaru","Impreza", Color.AMARILLO, new Motor( 4.5, TipoMotor.BENCINA ), new Tanque(), conductorSubaru2, null );

    nissan.setDriver( conductorNissan );
    nissan.setWheels( ruedasNissan );
    subaru.setDriver( conductorSubaru );
    subaru.setWheels( ruedasSubaru );

    Automovil.setPatentColor(Color.AMARILLO);
    nissan.setTank( new Tanque(50) );
    nissan.setColor(Color.BLANCO);
    nissan.setEngine( new Motor( 2.5, TipoMotor.BENCINA ) );

    System.out.println("Accediento a ENUMS");
    nissan.setType( TypeCar.HATCHBACK );
    toyota.setType( TypeCar.CONVERTIBLE );
    subaru.setType( TypeCar.COUPE );
    subaru.setEngine( new Motor( 5.3, TipoMotor.DIESEL ) );
    subaru2.setType( TypeCar.FURGON );

    System.out.println("Detalles del primer carro");
    System.out.println( nissan.detail() );
    System.out.println("Detalles del segundo carro");
    System.out.println( toyota.detail() );
    System.out.println("Detalles del tercer carro");
    System.out.println( subaru.detail() );
    System.out.println("Soy el carro 4 con id - " + subaru2.getId());

    System.out.println("Conductor de carro subaru " + subaru.getDriver());

    System.out.println("Ruedas de carro subaru");
    for( Rueda r: subaru.getWheels() ) {
      System.out.println(r.getBrand() + " , " + r.getRing() + " , " + r.getWidth() );
    }


  }
}
