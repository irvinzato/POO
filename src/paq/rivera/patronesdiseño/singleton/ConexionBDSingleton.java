package paq.rivera.patronesdiseño.singleton;

public class ConexionBDSingleton {
  private static ConexionBDSingleton instance;

  private ConexionBDSingleton() {
    System.out.println("Simulando conexión a base de datos, privado el constructor para no poder crear instancia desde fuera");
  }

  public static ConexionBDSingleton getInstance(){
    if( instance == null ) { //Solo se podrá instanciar una vez
      instance = new ConexionBDSingleton();
    }
    return instance;
  }


}
