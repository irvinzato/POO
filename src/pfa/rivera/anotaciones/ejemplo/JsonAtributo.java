package pfa.rivera.anotaciones.ejemplo;

import java.lang.annotation.*;

//Las anotaciones tienen metadata y se deben configurar
@Documented
@Target(ElementType.FIELD) //Donde se va a aplicar la anotación - FIELD es sobre atributos
@Retention(RetentionPolicy.RUNTIME) //En que contexto se va a ejecutar - RUNTIME en tiempo de ejecución
public @interface JsonAtributo {
  String nameAn() default "";
  boolean capitalize() default false;  //Opcional, la uso para poner mayúscula en "JsonSerializado"
}
