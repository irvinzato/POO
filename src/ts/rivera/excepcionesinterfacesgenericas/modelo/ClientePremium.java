package ts.rivera.excepcionesinterfacesgenericas.modelo;

public class ClientePremium extends Cliente implements Comparable<ClientePremium>{

  public ClientePremium(String name, String lastName) {
    super(name, lastName);
  }

  @Override
  public int compareTo(ClientePremium o) {
    return 0;
  }
}
