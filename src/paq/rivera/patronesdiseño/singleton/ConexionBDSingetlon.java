package paq.rivera.patronesdiseño.singleton;

public class ConexionBDSingetlon {
  private static ConexionBDSingetlon instance;

  private ConexionBDSingetlon() {
    System.out.println("Simulando conexión a base de datos, privado el constructor para no poder crear instancia desde fuera");
  }

  public static ConexionBDSingetlon getInstance(){
    if( instance == null ) { //Solo se podrá instanciar una vez
      instance = new ConexionBDSingetlon();
    }
    return instance;
  }


}
