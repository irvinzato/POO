public class Motor {
  private double cylinders;
  private TipoMotor type;

  public Motor() {

  }

  public Motor( double cylinders, TipoMotor type ) {
    this.cylinders = cylinders;
    this.type = type;
  }

  public double getCylinders() {
    return this.cylinders;
  }

  public void setCylinders( double cylinders ) {
    this.cylinders = cylinders;
  }

  public TipoMotor getType() {
    return this.type;
  }

  public void setType( TipoMotor type ) {
    this.type = type;
  }

}
