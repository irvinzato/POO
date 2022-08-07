public class AutomovilEnumEjemplo {
  public static void main(String[] args) {
    Automovil sony = new Automovil("Nissan", "Sony");
    Automovil raize = new Automovil("Toyota", "Raize", Color.BLANCO, new Motor( 3.5, TipoMotor.BENCINA ));
    Automovil.setPatentColor(Color.AMARILLO);

    sony.setTank( new Tanque() );
    sony.setColor(Color.BLANCO);
    sony.setType( TypeCar.HATCHBACK );
    raize.setType( TypeCar.PICKUP );

    TypeCar typeSony = sony.getType();
    TypeCar typeRaize = raize.getType();

    //Desde el JDK 13 se mejoró el switch con uso de flecha y el break es automático
    switch (typeRaize) {
      case CONVERTIBLE -> System.out.println("El automovil es deportivo y desacopable de dos puertas");
      case COUPE -> System.out.println("El automovil es pequeño de dos puertas, tipicamente deportivo");
      case FURGON -> System.out.println("Es un automovil utilitario de transporte, de empresas");
      case PICKUP -> System.out.println("Es un automovil de doble cabina o camioneta");
      case HATCHBACK -> System.out.println("Es un automovil mediano compacto, aspecto deportivo");
      case SEDAN -> System.out.println("Es un automovil mediano");
      case STATION_WAGON -> System.out.println("Es un automovil mas grande, con maleta grande");
      default -> System.out.println("Sin informacion");
    }

    //Los enums son iterables
    TypeCar[] types = TypeCar.values();
    for( TypeCar tc: types ) {
      System.out.println("type car = " + tc + " nombre " + tc.getName() + " descripcion " + tc.getDescription()
              + " puertas " + tc.getNumberDoors());
    }


  }
}
