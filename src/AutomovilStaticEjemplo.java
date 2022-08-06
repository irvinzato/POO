public class AutomovilStaticEjemplo {
  public static void main(String[] args) {
    Automovil car = new Automovil("Nissan", "Sony");
    Automovil car2 = new Automovil("Toyota", "Raize", "Blanco", 3.5);
    Automovil car3 = new Automovil("Subaru","Impreza");
    Automovil car4 = new Automovil("Subaru","Impreza");
    Automovil car5 = new Automovil();
    //Modifico variable static, cambia para todos los objetos
    Automovil.setPatentColor("Verde");

    car.setDisplacement(2.5);
    car.setColor("Negro");

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


  }
}
