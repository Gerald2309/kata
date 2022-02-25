package co.com.sofka.demo;

import org.springframework.data.repository.CrudRepository;

//CRUDREPOSITORY:
public interface TodoRepository extends CrudRepository <Todo, Long> {
}
