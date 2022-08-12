package ri.rivera.genericsclass;

public class GenericosEjemplo {
  public static void main(String[] args) {
    Camion truckHorses = new Camion(5);
    truckHorses.add(new Animal("Peregrino", "Caballo"));
    truckHorses.add(new Animal("Lenguas", "Caballo"));
    truckHorses.add(new Animal("Glu", "Caballo"));
    truckHorses.add(new Animal("Freya", "Caballo"));
    truckHorses.add(new Animal("Isis", "Caballo"));
    truckHorses.add(new Animal("Hades", "Caballo"));

    System.out.println("Camión de animales");
    for (Object o : truckHorses) {
      System.out.println(((Animal) o).getName() + " tipo: " + ((Animal) o).getType());
    }

    Camion truckMachines = new Camion(3);
    truckMachines.add(new Maquinaria("Bulldozer"));
    truckMachines.add(new Maquinaria("Grúa Horquilla"));
    truckMachines.add(new Maquinaria("Perforadora"));

    System.out.println("Camión de maquinaria");
    for(Object o: truckMachines) {
      System.out.println( ((Maquinaria) o).getType() );
    }

    Camion truckCar = new Camion(3);
    truckCar.add(new Automovil("Toyota"));
    truckCar.add(new Automovil("Mitsubishi"));
    truckCar.add(new Automovil("Hyundai"));

    System.out.println("Camión de autos");
    for(Object o: truckCar) {
      System.out.println( ((Automovil) o).getBrand() );
    }
  }
}
