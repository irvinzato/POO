public class AutomovilEjemplo {
  public static void main(String[] args) {
    Automovil car = new Automovil();
    Automovil car2 = new Automovil();

    car.maker = "Subaru";
    car.model = "I 10";
    car.displacement = 2.0;
    car.color = "Negro";
    
    car2.maker = "Mazda";
    car2.color = "Azul";
    car2.displacement = 3.0;

    System.out.println("Detalles del primer carro");
    System.out.println( car.detail() );
    System.out.println("Detalles del segundo carro");
    System.out.println( car2.detail() );
  }
}
