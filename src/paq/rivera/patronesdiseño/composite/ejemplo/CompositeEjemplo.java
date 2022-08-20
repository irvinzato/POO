package paq.rivera.patronesdiseño.composite.ejemplo;

import paq.rivera.patronesdiseño.composite.Archivo;
import paq.rivera.patronesdiseño.composite.Directorio;

public class CompositeEjemplo {
  public static void main(String[] args) {
    Directorio doc = new Directorio("Documentos");
    Directorio java = new Directorio("Java");

    java.addComponent(new Archivo("patron-componente.docx"));

    Directorio stream = new Directorio("API Stream");
    stream.addComponent(new Archivo("Stream-map.docx"));

    java.addComponent(stream); //Java contiene un archivo y un directorio hasta este punto
    doc.addComponent(java);

    doc.addComponent(new Archivo("cv.docx"));
    doc.addComponent(new Archivo("logo.png"));

    System.out.println("Raíz, aquí parte todo:");
    System.out.println(doc.show(0));

  }
}
