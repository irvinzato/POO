package fil.rivera.creararchivos.ejemplos;

import fil.rivera.creararchivos.ejemplos.servicio.ArchivoService;

public class CrearArchivoEjemplo {
  public static void main(String[] args) {
    //Muy importante que la ruta donde se quiere guardar el archivo exista
    String nameFile = "D:\\Cursos\\Java\\archivo\\java.txt";
    ArchivoService fileService = new ArchivoService();

    fileService.createFile(nameFile);


  }

}
