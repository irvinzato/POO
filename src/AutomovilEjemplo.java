public class AutomovilEjemplo {
  public static void main(String[] args) {
    Automovil car = new Automovil();
    Automovil car2 = new Automovil();

    //Principio de ocultar variables de nuestra clase
    car.setMaker("Subaru");
    car.setModel("I-10");
    car.setDisplacement(2.5);
    car.setColor("Negro");

    car2.setMaker("Mazda");
    car2.setModel("BT-50");
    car2.setDisplacement(3.5);
    car2.setColor("Azul");

    System.out.println("Detalles del primer carro");
    System.out.println( car.detail() );
    System.out.println("Detalles del segundo carro");
    System.out.println( car2.detail() );

    System.out.println(car.speedUp( 3000 ));
    System.out.println(car.stop());
    System.out.println("Combinacion de metodos");
    System.out.println(car.speedUpStop( 4000 ));

    //ENCAPSULAMIENTO, manda a llamar el método pero no sabe como se implementa, esta encapsulado
    //POLIMORFISMO, diferentes formas de hacer lo mismo
    System.out.println("Kilometros por litro metodo 1 - " + car.calculateConsumption( 300, 0.6f ));
    System.out.println("Kilometros por litro metodo 2 - " + car.calculateConsumption( 300, 60 ));

  }
}
