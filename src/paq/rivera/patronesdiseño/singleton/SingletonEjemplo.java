package paq.rivera.patronesdiseño.singleton;

public class SingletonEjemplo {
  public static void main(String[] args) {
    System.out.println("SingleTon - Este patrón solo deja crear una sola instancia de una clase, una sola referencia compartida para toda la aplicación");
    ConexionBDSingetlon conection = null;
    for(int i = 0; i < 10; i++ ) {
      System.out.println("Conexión "+ i + " " +  conection);
      conection = ConexionBDSingetlon.getInstance();
    }

    ConexionBDSingetlon conection2 = ConexionBDSingetlon.getInstance();
    ConexionBDSingetlon conection3 = ConexionBDSingetlon.getInstance();
    boolean b1 = (conection == conection2);
    System.out.println("¿Perimer conexión es igual a segunda conexión? " + b1);

    boolean b2 = ((conection == conection2) && (conection2 == conection3));
    System.out.println("¿Perimer conexión es igual a segunda conexión y segunda a tercera? " + b2);

  }
}
