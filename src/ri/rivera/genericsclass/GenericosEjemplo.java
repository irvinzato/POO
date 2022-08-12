package ri.rivera.genericsclass;

public class GenericosEjemplo {

  public static void main(String[] args) {
    Camion<Animal> truckHorses = new Camion<>(5);
    truckHorses.add(new Animal("Peregrino", "Caballo"));
    truckHorses.add(new Animal("Lenguas", "Caballo"));
    truckHorses.add(new Animal("Glu", "Caballo"));
    truckHorses.add(new Animal("Freya", "Caballo"));
    truckHorses.add(new Animal("Isis", "Caballo"));
    truckHorses.add(new Animal("Hades", "Caballo"));

    System.out.println("Camión de animales");
    for(Animal a : truckHorses) {
      System.out.println(a.getName() + " tipo: " + a.getType());
    }

    Camion<Maquinaria> truckMachines = new Camion(3);
    truckMachines.add(new Maquinaria("Bulldozer"));
    truckMachines.add(new Maquinaria("Grúa Horquilla"));
    truckMachines.add(new Maquinaria("Perforadora"));

    System.out.println("Camión de maquinaria");
    for(Maquinaria m: truckMachines) {
      System.out.println( m.getType() );
    }

    Camion<Automovil> truckCar = new Camion(3);
    truckCar.add(new Automovil("Toyota"));
    truckCar.add(new Automovil("Mitsubishi"));
    truckCar.add(new Automovil("Hyundai"));

    System.out.println("Camión de autos");
    for(Automovil a: truckCar) {
      System.out.println( a.getBrand() );
    }
  }

  //Otra manera de hacer el for del método principal, llamando este método
  public static <T> void toPrintTruck(Camion<T> truck) {
    for(T a : truck) {
      if( a instanceof Animal ){
        System.out.println( ((Animal)a).getName() + " tipo: " + ((Animal)a).getType());
      }
      if( a instanceof Maquinaria ){
        System.out.println( ((Maquinaria)a).getType());
      }
      if( a instanceof Automovil ){
        System.out.println( ((Automovil)a).getBrand());
      }
    }
  }
}
