package co.com.sofka.demo;

import org.springframework.data.repository.CrudRepository;

//CRUDREPOSITORY: ya contiene las funciones para eliminar-agregar-obtener etc
public interface TodoRepository extends CrudRepository <Todo, Long> {
}
