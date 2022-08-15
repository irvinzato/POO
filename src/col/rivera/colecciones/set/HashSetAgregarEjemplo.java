package col.rivera.colecciones.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//S-24
public class HashSetAgregarEjemplo {
  public static void main(String[] args) {
    //Pongo "Set" en lugar de "HashSet" porque es la clase más genérica
    Set<String> hs = new HashSet<>();
    hs.add("Buda");
    hs.add("Jack");
    hs.add("Raiden");
    hs.add("Shiva");
    hs.add("Loki");
    boolean permit = hs.add("Buda");

    //No se puede ordenar un "HashSet", debería pasarlo a un "List"
    //Collections.sort(hs);

    System.out.println("Un HashSet, NO es ordenado y no agrega objetos repetidos: " + hs +
            " respuesta de elemento que ya existe en arreglo: " + permit);


  }

}
