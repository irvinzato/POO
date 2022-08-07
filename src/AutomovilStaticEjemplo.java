public class AutomovilStaticEjemplo {
  public static void main(String[] args) {
    Automovil car = new Automovil("Nissan", "Sony");
    Automovil car2 = new Automovil("Toyota", "Raize", Color.BLANCO, new Motor( 4.0, TipoMotor.DIESEL ));
    Automovil car3 = new Automovil("Subaru","Impreza");
    Automovil car4 = new Automovil("Subaru","Impreza");
    Automovil car5 = new Automovil();
    //Modifico variable static, cambia para todos los objetos
    Automovil.setPatentColor(Color.AMARILLO);
    car.setTank( new Tanque(50) );
    //Se accede a los enums igual que los static, con el nombre del enum o clase(solo se debe actualizar en la clase el tipo)
    car.setColor(Color.BLANCO);
    car.setEngine( new Motor( 2.5, TipoMotor.BENCINA ) );

    //Enums
    System.out.println("Accediento a ENUMS");
    car.setType( TypeCar.HATCHBACK );
    car2.setType( TypeCar.CONVERTIBLE );
    car3.setType( TypeCar.COUPE );
    car3.setEngine( new Motor( 5.3, TipoMotor.DIESEL ) );
    car4.setType( TypeCar.FURGON );

    System.out.println("Detalles del primer carro");
    System.out.println( car.detail() );
    System.out.println("Detalles del segundo carro");
    System.out.println( car2.detail() );
    System.out.println("Detalles del tercer carro");
    System.out.println( car3.detail() );
    System.out.println("Soy el carro 4 con id - " + car4.getId());

    //Si es estatico no es correcto mandarlo a llamar con el nombre de algún objeto
    System.out.println("Metodo estatico " + Automovil.calculateConsumptionStatic( 300, 60 ));
    System.out.println("Atributo estatico del tanque " + Automovil.getTankCapacityStatic( ));
    System.out.println("Total de objetos Automovil creados " + Automovil.getLastID());

    //constantes(final)
    System.out.println("Velocidad maxima en carretera " + Automovil.MAXIMUM_HIGHWAY_SPEED);
    System.out.println("Velocidad maxima en ciudad " + Automovil.MAXIMUM_CITY_SPEED);


  }
}
