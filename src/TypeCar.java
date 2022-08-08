public enum TypeCar {
  SEDAN("Sedan", "Auto normal", 4),
  STATION_WAGON("Station Wagon", "Auto grande", 4),
  HATCHBACK("Hatchback", "Auto compacto", 4),
  PICKUP("Pickup", "Camioneta", 4),
  COUPE("Coupe", "Auto pequeño", 2),
  CONVERTIBLE("Convertible", "Auto deportivo", 2),
  FURGON("Furgon", "Auto utilitario", 4),
  SUV("SUV", "Todo terreno deportivo", 4);

  private final String name;
  private final String description;
  private final int numberDoors;

  TypeCar(String name, String description, int numberDoors)  {
    this.name = name;
    this.description = description;
    this.numberDoors = numberDoors;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getNumberDoors() {
    return numberDoors;
  }
}
