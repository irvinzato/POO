package rec.rivera.recursividad.ejemplo;

import rec.rivera.recursividad.ejemplo.models.Componente;

import java.util.stream.Stream;

public class RecursividadEjemplo {
  public static void main(String[] args) {

    System.out.println("Armado de PC, componentes que tienen otros componentes");
    Componente pc = new Componente("Gabinente PC ATX");
    Componente power = new Componente("Fuente Poder Gold 700w");
    Componente motherboard = new Componente("Placa Madre MainBoard Asus sockets AMD");
    Componente cpu = new Componente("AMD Ryzen 5 3200");
    Componente fan = new Componente("Ventilador CPU");
    Componente sink = new Componente("Disipador CPU");
    Componente graphicsCard = new Componente("Nvidia RTX 3080 8GB");
    Componente gpu = new Componente("Nvidia GPU RTX");
    Componente gpuRam = new Componente("4GB Ram");
    Componente gpuRam2 = new Componente("4GB Ram");
    Componente gpuFans = new Componente("Ventiladores GPU");
    Componente ram = new Componente("Memoria Ram 32GB");
    Componente ssd = new Componente("Disco SSD 2T");

    cpu.addComponent(fan).addComponent(sink);
    graphicsCard.addComponent(gpu)
            .addComponent(gpuRam)
            .addComponent(gpuRam2)
            .addComponent(gpuFans);
    motherboard.addComponent(cpu)
            .addComponent(graphicsCard)
            .addComponent(ram)
            .addComponent(ssd);
    pc.addComponent(power)
            .addComponent(motherboard)
            .addComponent(new Componente("Teclado"))
            .addComponent(new Componente("Mouse"));

    System.out.println("Llamada al método recursivo desde el padre");
    recursiveMethod(pc, 0);

    System.out.println("Llamada al método recursivo JAVA 8 - Stream");
    recursiveMethodJava8(pc, 0).forEach( c -> System.out.println("\t".repeat(c.getLevel()) + c.getName() ));
  }

  public static void recursiveMethod(Componente comp, Integer level) {
    System.out.println("\t".repeat(level) + level.toString() + " " +  comp.getName());
    if( comp.hasChildren() ) {
      for( Componente child: comp.getListComponents() ){
        recursiveMethod(child, level + 1);
      }
    }
  }

  public static Stream<Componente> recursiveMethodJava8(Componente comp, int level) {
    comp.setLevel(level);
    System.out.println(comp.getLevel());
    return Stream.concat(Stream.of(comp),
            comp.getListComponents().stream().flatMap(child -> recursiveMethodJava8(child, level+1)));
  }


}
