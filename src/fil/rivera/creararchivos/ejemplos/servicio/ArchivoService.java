package fil.rivera.creararchivos.ejemplos.servicio;

import java.io.*;
import java.util.Scanner;

public class ArchivoService {

  public void createFileWriter(String nameFile) { //Para trabajar con pocas líneas de texto
    File file = new File(nameFile);
    try {
      FileWriter writer = new FileWriter(file); //El segundo parámetro en "true" aria que se agregue contenido cada que se ejecuta
      writer.append("Añadiendo texto al archivo que se va a crear...")
              .append("Siempre adelante !\n")
              .append("Vamos a darle con todo");
      writer.close(); //Importante el "close" para cerrar el recurso y se pueda añadir lo de arriba
      System.out.println("El archivo se creo con éxito ! usando FileWriter");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void createFileBuffer(String nameFile) {
    File file = new File(nameFile);
    try {
      FileWriter writer = new FileWriter(file);  //Se encarga de crear el archivo
      BufferedWriter buffer = new BufferedWriter(writer); //Es mas optimizado que "FileWriter" para escribir cantidades
      buffer.append("Añadiendo texto al archivo que se va a crear...")
              .append("Siempre adelante !\n")
              .append("Vamos a darle con todo");
      buffer.close();
      System.out.println("El archivo se creo con éxito ! usando BufferedWriter");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void createFilePrintWriter(String nameFile) {
    File file = new File(nameFile);
    try {
      FileWriter writer = new FileWriter(file);  //Se encarga de crear el archivo
      PrintWriter print = new PrintWriter(writer); //Más optimizado que "FileWriter", permite usar métodos como el "printline" escribir en el archivo como si fuera una consola
      //No es encadenado
      print.println("Añadiendo texto al archivo que se va a crear...");
      print.println("Siempre adelante !");
      print.printf("Vamos a darle con todo %s", "Irving");
      print.close();
      System.out.println("El archivo se creo con éxito ! usando PrintWriter");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  //Primera forma de leer archivo - Usando FileReader y BufferReader
  public String readFile(String nameFile) {
    StringBuilder sb = new StringBuilder(); //Aquí guardaré todas las líneas del archivo
    File file = new File(nameFile);
    try {
      FileReader readerFile = new FileReader(file);
      BufferedReader readerBuf = new BufferedReader(readerFile);
      String line;
      //String line = readerBuf.readLine(); //Aquí leo solo una línea y quiero todas
      while( (line = readerBuf.readLine()) != null ) {
        sb.append(line).append("\n");
      }
      readerBuf.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return sb.toString();
  }

  //Segunda forma de leer archivo - Usando Scanner
  public String readFile2(String nameFile) {
    StringBuilder sb = new StringBuilder();
    File file = new File(nameFile);
    try {
      Scanner s = new Scanner(file);
      s.useDelimiter("\n"); //Patron por el cual va a separar las líneas
      while( s.hasNext() ) {
        sb.append(s.next()).append("\n");
      }
      s.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return sb.toString();
  }

}
