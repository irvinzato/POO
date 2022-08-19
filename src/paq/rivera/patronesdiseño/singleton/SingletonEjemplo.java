package paq.rivera.patronesdiseño.singleton;

public class SingletonEjemplo {
  public static void main(String[] args) {
    System.out.println("SingleTon - Este patrón solo deja crear una sola instancia de una clase, una sola referencia compartida para toda la aplicación");
    ConexionBDSingleton conection = null;
    for(int i = 0; i < 10; i++ ) {
      System.out.println("Conexión "+ i + " " +  conection);
      conection = ConexionBDSingleton.getInstance();
    }

    ConexionBDSingleton conection2 = ConexionBDSingleton.getInstance();
    ConexionBDSingleton conection3 = ConexionBDSingleton.getInstance();
    boolean b1 = (conection == conection2);
    System.out.println("¿Perimer conexión es igual a segunda conexión? " + b1);

    boolean b2 = ((conection == conection2) && (conection2 == conection3));
    System.out.println("¿Perimer conexión es igual a segunda conexión y segunda a tercera? " + b2);

  }
}
