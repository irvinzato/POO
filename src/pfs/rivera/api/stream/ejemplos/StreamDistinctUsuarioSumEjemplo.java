package pfs.rivera.api.stream.ejemplos;

import pfs.rivera.api.stream.ejemplos.models.Usuario;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDistinctUsuarioSumEjemplo {
  public static void main(String[] args) {
    System.out.println("¿Cuantos caracteres tienen?. Operadores mapToInt(), sum(), summaryStatics().");
    IntStream largeNames = Stream
            .of("Irving Rivera", "Naomi Guzman", "Angeles Lopez", "Mauricio Banderley", "Naomi Marley"
                , "Irving Rivera", "Irving Rivera")
            .map( name -> new Usuario( name.split(" ")[0], name.split(" ")[1] ))
            .distinct()
            .mapToInt( user -> user.toString().length() ) //Incluye todos los caracteres que están en método toString
            .peek(System.out::println);

    //Solo se puede tener un operador funcional, por eso se comenta y des comenta el que se quiera usar, alli el uso del peek
    System.out.println("Recorrido del Stream, Suma de cada una de las cadenas");
    //largeNames.forEach(System.out::println);
    //System.out.println("Suma de todos los caracteres: " + largeNames.sum());

    System.out.println("Uso del summaryStatistics para todos las estadisticas" );
    IntSummaryStatistics stats = largeNames.summaryStatistics();
    System.out.println("Todas las estadisticas - " + stats);





  }
}
