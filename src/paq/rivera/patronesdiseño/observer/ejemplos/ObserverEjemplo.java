package paq.rivera.patronesdiseño.observer.ejemplos;

import paq.rivera.patronesdiseño.observer.Corporacion;
//Este ejemplo avisa a los usuarios que invierten en ciertas compañías que el precio ha cambiado
public class ObserverEjemplo {
  public static void main(String[] args) {

    Corporacion google = new Corporacion("Google", 1000);
    google.addObserver(observable -> {
      System.out.println( "John: " + observable ); //aquí imprimo el toString del objeto para simplificar lo de abajo
    });

    google.addObserver(observable -> {
      System.out.println( "Irving: " + ((Corporacion)observable).getName() +
                         " nuevo precio: " + ((Corporacion)observable).getPrice() );
    });

    google.addObserver(observable -> {
      System.out.println( "Jade: " + ((Corporacion)observable).getName() +
                         " nuevo precio: " + ((Corporacion)observable).getPrice() );
    });

    //Notifica hasta que cambia el valor
    google.modifyPrice(2000);

  }
}
