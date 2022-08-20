package fil.rivera.creararchivos.ejemplos.servicio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoService {

  public void createFile(String nameFile) {
    File file = new File(nameFile);
    try {
      FileWriter writer = new FileWriter(file); //El segundo parámetro en "true" aria que se agregue contenido cada que se ejecuta
      writer.append("Añadiendo texto al archivo que se va a crear...")
              .append("Siempre adelante !\n")
              .append("Vamos a darle con todo");
      writer.close(); //Importante el "close" para cerrar el recurso y se pueda añadir lo de arriba
      System.out.println("El archivo se creo con éxito !");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
