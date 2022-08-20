package paq.rivera.patronesdiseño.observer;

import java.util.ArrayList;
import java.util.List;

//SEGUNDO EJEMPLO
public class UsuarioRepositorio extends Observable{

  private List<String> repository = new ArrayList<>();

  public void createUser(String user) {
    repository.add(user);
    notifyObserver();  //Cada que se añada un usuario notifico
  }

}
