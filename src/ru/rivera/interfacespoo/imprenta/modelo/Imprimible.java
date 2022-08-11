package ru.rivera.interfacespoo.imprenta.modelo;

public interface Imprimible {
  //En las interfaces no es necesario el public, es redundante, siempre debe ser "public"
  //De esta manera es obligatorio que el hijo implemente el método
  String toPrint();



  //Nota: Lo siguiente no lo ocupo, solo es educativo para conocer más de las interfaces
  //Cuando es "default" no es necesario que las clases hijas implementen el método
  default String toPrintDef() {
    return "Imprimiendo valor por defecto";
  }
  //También deja hacer métodos estáticos que le pertenecen a la clase y no a la instancia
  static void toPrintStat(Imprimible printable) {
    System.out.println(printable.toPrint());
  }
}
