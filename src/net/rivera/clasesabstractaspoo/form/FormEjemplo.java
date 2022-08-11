package net.rivera.clasesabstractaspoo.form;

import net.rivera.clasesabstractaspoo.form.elementos.*;
import net.rivera.clasesabstractaspoo.form.elementos.select.*;

import java.util.ArrayList;
import java.util.List;

public class FormEjemplo {
  public static void main(String[] args) {
    //No se puede instancear clases abstractas de la misma manera, se crean de las siguientes maneras
    /*Esta es una forma pero la usaré después
    ElementoForm element = new ElementoForm() {
      @Override
      public String drawHtml() {
        return null;
      }
    };*/
    InputForm username = new InputForm("username"); //Es text por defecto
    InputForm password = new InputForm("clave","password");
    InputForm email = new InputForm("email","email");
    InputForm age = new InputForm("edad","number");

    TextAreaForm experience = new TextAreaForm("exp", 5, 9);

    SelectForm language = new SelectForm("lenguaje");
    Opcion java = new Opcion("Java", "1");
    language.addOption(java);
    language.addOption(new Opcion("Python", "2")); //Otra manera de añadir, creando el objeto dentro del método
    language.addOption(new Opcion("JavaScript", "3"));
    language.addOption(new Opcion("Typescript", "4"));
    language.addOption(new Opcion("PHP", "5"));

    username.setValue("irvinzato");
    password.setValue("123456");
    email.setValue("multizato@hotmail.com");
    age.setValue("26");
    experience.setValue("Más de 6 años de experiencia...");
    java.setSelected(true);

    //Todos son tipo "ElementoForm" porque es la clase padre de todas
    List<ElementoForm> elements = new ArrayList<>(); //También puedo usar Arrays.asList(username,password...); es lo mismo pero de otra forma
    elements.add(username);
    elements.add(password);
    elements.add(email);
    elements.add(age);
    elements.add(experience);
    elements.add(language);

    for(ElementoForm ef: elements) {
      System.out.println(ef.drawHtml());
      System.out.println("<br>");
    }
    //Otra forma de iterar con expresión lambda
    System.out.println("Iteración forEach con expresión lambda");
    elements.forEach( ef -> {
      System.out.println(ef.drawHtml());
      System.out.println("<br>");
    });

  }


}
