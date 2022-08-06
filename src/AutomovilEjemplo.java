public class AutomovilEjemplo {
  public static void main(String[] args) {
    Automovil car = new Automovil("Nissan", "Sony");
    Automovil car2 = new Automovil("Toyota", "Raize", "Blanco", 3.5);
    //Permite crear este sin parámetros porque tengo 2 constructores en Automovil(Sobre carga)
    Automovil car3 = new Automovil("Subaru","Impreza");
    Automovil car4 = new Automovil("Subaru","Impreza");
    Automovil car5 = new Automovil();

    //Principio de ocultar variables de nuestra clase
    car.setDisplacement(2.5);
    car.setColor("Negro");

    System.out.println("Detalles del primer carro");
    System.out.println( car.detail() );
    System.out.println("Detalles del segundo carro");
    System.out.println( car2.detail() );
    System.out.println("Detalles del tercer carro");
    System.out.println( car3.detail() );

    System.out.println(car.speedUp( 3000 ));
    System.out.println(car.stop());
    System.out.println("Combinacion de metodos");
    System.out.println(car.speedUpStop( 4000 ));

    //ENCAPSULAMIENTO, manda a llamar el método pero no sabe como se implementa, esta encapsulado
    //POLIMORFISMO, diferentes formas de hacer lo mismo
    System.out.println("Kilometros por litro metodo 1 - " + car.calculateConsumption( 300, 0.6f ));
    System.out.println("Kilometros por litro metodo 2 - " + car.calculateConsumption( 300, 60 ));

    //Comprobar que todos los objetos son únicos
    System.out.print("¿Son iguales los objetos del carro 3 y carro 4? - ");
    System.out.println(car3 == car4);
    System.out.print("¿Son iguales? modifique el equals de la clase Automovil para comparar por valor - ");
    System.out.println(car3.equals(car4));

    System.out.print("Comparando con un objeto que tiene propiedades null - ");
    System.out.println(car5.equals(car4));

    //método toString personalizado
    System.out.println(car2);
    System.out.println(car2.toString());

  }
}
