package fil.rivera.creararchivos.ejemplos;

import fil.rivera.creararchivos.ejemplos.servicio.ArchivoService;

public class LeerArchivoEjemplo {
  public static void main(String[] args) {

    String nameFile = "D:\\Cursos\\Java\\archivo\\java.txt";

    ArchivoService service = new ArchivoService();
    System.out.println("Primer forma");
    System.out.println(service.readFile(nameFile));

    System.out.println("Segunda forma");
    System.out.println(service.readFile2(nameFile));

  }
}
