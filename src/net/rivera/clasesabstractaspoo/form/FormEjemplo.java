package net.rivera.clasesabstractaspoo.form;

import net.rivera.clasesabstractaspoo.form.elementos.*;
import net.rivera.clasesabstractaspoo.form.elementos.select.*;
import net.rivera.clasesabstractaspoo.form.validador.*;

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
    username.addValidator(new RequeridoValidador());
    InputForm password = new InputForm("clave","password");
    password.addValidator(new RequeridoValidador())
            .addValidator(new LargoValidador( 6, 12));
    InputForm email = new InputForm("email","email");
    email.addValidator(new RequeridoValidador())
          .addValidator(new EmailValidador());
    InputForm age = new InputForm("edad","number");
    age.addValidator(new NumeroValidador());

    TextAreaForm experience = new TextAreaForm("exp", 5, 9);

    SelectForm language = new SelectForm("lenguaje");
    Opcion java = new Opcion("Java", "1");
    language.addOption(java);
    language.addOption(new Opcion("Python", "2")); //Otra manera de añadir, creando el objeto dentro del método
    language.addOption(new Opcion("JavaScript", "3").setSelected());  //Sobre carga de métodos
    language.addOption(new Opcion("Typescript", "4"));
    language.addOption(new Opcion("PHP", "5"));
    language.addValidator(new NoNuloValidador());

    //De esta forma se crea la instancia de una clase abstracta
    ElementoForm hello = new ElementoForm("saludo") {
      @Override
      public String drawHtml() {
        return "<input disabled name='" + this.name + "' value='" + this.value + "'>";
      }
    };
    hello.setValue("Hola que tal, campo desabilitado");

    username.setValue("");
    password.setValue("123456");
    email.setValue("multizato@hotmail.com");
    age.setValue("26");
    experience.setValue("Más de 6 años de experiencia...");
    //java.setSelected(true);

    //Todos son tipo "ElementoForm" porque es la clase padre de todas
    List<ElementoForm> elements = new ArrayList<>(); //También puedo usar Arrays.asList(username,password...); es lo mismo pero de otra forma
    elements.add(username);
    elements.add(password);
    elements.add(email);
    elements.add(age);
    elements.add(experience);
    elements.add(language);
    elements.add(hello);

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

    System.out.println("Revision de errores");
    elements.forEach(ef -> {
      if( !ef.isValid() ) {   //System.out::println - Es la forma de simplificar un método por referencia en lambda
        ef.getErrors().forEach(System.out::println);
      }
    });

  }


}
