package paq.rivera.patronesdiseño.composite.ejemplo;

import paq.rivera.patronesdiseño.composite.Archivo;
import paq.rivera.patronesdiseño.composite.Directorio;

public class CompositeBuscarEjemplo {
  public static void main(String[] args) {
    Directorio doc = new Directorio("Documentos");
    Directorio java = new Directorio("Java");

    java.addComponent(new Archivo("patron-composite.docx"));

    Directorio stream = new Directorio("API Stream");
    stream.addComponent(new Archivo("Stream-map.docx"));

    java.addComponent(stream); //Java contiene un archivo y un directorio hasta este punto
    doc.addComponent(java);

    doc.addComponent(new Archivo("cv.docx"));
    doc.addComponent(new Archivo("logo.png"));

    System.out.println("SIEMPRE SE BUSCA DESDE LA RAÍZ");
    boolean found = doc.search("patron-composite.docx");
    System.out.println("Encontrado: \"patron-composite.docx\": " + found);

    found = doc.search("Stream-map.docx");
    System.out.println("Encontrado \"Stream-map.docx\": " + found);

  }
}
