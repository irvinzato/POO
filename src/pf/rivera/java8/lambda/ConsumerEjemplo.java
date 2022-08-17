package pf.rivera.java8.lambda;

import pf.rivera.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerEjemplo {
  public static void main(String[] args) {
    //Una expresión lambda es una interfaz funcional
    Consumer<String> consumer = greeting -> System.out.println(greeting);
    //Un "Consumer" no regresa nada, solo realiza una implementación
    Consumer<Date> dateConsumer = date -> {
      SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
      System.out.println(df.format(date));
    };
    //Consume 2 parámetros a diferencia del "Consumer"
    BiConsumer<String, Integer> biConsumer = ( name, age ) -> System.out.println(name + " tiene " + age + " años");

    consumer.accept("Hola amigo"); //Se tiene que invocar "accept" para que empiece la implementación del "Consumer"
    dateConsumer.accept(new Date());

    biConsumer.accept("Irving", 26);

    //Referencias de métodos(Se pasa por argumento y se recibe en una línea)
    Consumer<String> consumer2 = System.out::println;
    consumer2.accept("Mensaje del consumer 2, referencia de método lambda");

    List<String> names = Arrays.asList("Jade","Naomi","Aketzalli","Angeles");
    //Implemento el recorrido dentro del forEach pero abajo hay otra manera
    names.forEach((name) -> {
      System.out.println("Nombre: " + name);
    });
    //Ya que recibe un consumer, puedo darle uno que ya implemente
    names.forEach(consumer2);


    //Supplier<Usuario> createUser = () -> new Usuario(); //Otra manera de implementar el objeto, solo en "user" seria igual a "createUser.get()"
    Usuario user = new Usuario();

    BiConsumer<Usuario, String> assignName = (person, name) -> person.setName(name); //Se puede simplificar a "Usuario::setName;"

    assignName.accept(user, "Shiva");
    System.out.println("Nombre asignado a usuario: " + user.getName());

    //En "Supplier"(proveedor), siempre hay un return a diferencia de "Consumer"
    Supplier<String> supplier = () -> "Soy el proveedor, lambda supplier";

    System.out.println(supplier.get());

  }
}
