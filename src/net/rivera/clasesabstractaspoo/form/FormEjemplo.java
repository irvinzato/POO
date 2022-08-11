package net.rivera.clasesabstractaspoo.form;

import net.rivera.clasesabstractaspoo.form.elementos.ElementoForm;
import net.rivera.clasesabstractaspoo.form.elementos.InputForm;
import net.rivera.clasesabstractaspoo.form.elementos.SelectForm;
import net.rivera.clasesabstractaspoo.form.elementos.TextAreaForm;
import net.rivera.clasesabstractaspoo.form.elementos.select.Opcion;

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

    java.setSelected(true);

  }


}
