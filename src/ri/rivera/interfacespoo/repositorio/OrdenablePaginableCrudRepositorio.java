package ri.rivera.interfacespoo.repositorio;
//Puedo tener una Interfaz que Herede todas las interfaces que ocupo, queda agrupado en una
//De esta manera ya no es necesario realizar cast cuando quiera utilizar una en particular
public interface OrdenablePaginableCrudRepositorio extends OrdenableRepositorio,
PaginableRepositorio, CrudRepositorio, ContableRepositorio {

}
