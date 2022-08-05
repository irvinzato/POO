public class Automovil {
  //La idea es que maneje datos la clase y los retorne
  String maker;
  String model;
  String color = "Blanco";
  double displacement;

  public String detail() {
    //Con "this" hace referencia a sí mismo dentro de la clase(avaces se puede omitir, depende la situación)
    String maker = "Por definir";
    StringBuilder sb = new StringBuilder();
    sb.append("maker = " + this.maker);
    sb.append("\nmodel = " + this.model);
    sb.append("\ncolor = " + this.color);
    sb.append("\ndisplacement = " + this.displacement);
    return sb.toString();
  }

}
