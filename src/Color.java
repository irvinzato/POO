public enum Color {
  ROJO("Rojo"),
  AMARILLO("Amarillo"),
  AZUL("Azul"),
  BLANCO("Blanco"),
  GRIS("Gris"),
  NARANJA("Naranja");

  //Pudiera personalizar más atributos y por cada uno debo tener una variable con final
  private final String color;
  //Puedo personalizar el valor usando el constructor
  Color( String color ) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

}
