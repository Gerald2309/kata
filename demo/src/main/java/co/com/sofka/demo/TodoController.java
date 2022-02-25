package co.com.sofka.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @Autowired
    private TodoService service;
    //INSTAR TODOS LOS ELEMENTOS

    @GetMapping(value = "api/todo")
    public Iterable <Todo> list()
    {
        return service.list();
    }

    @PostMapping(value = "api/todo")
    public Todo save(@RequestBody Todo todo){
        return service.save(todo);
    }

    @PutMapping(value = "api/todo")
    public Todo update(@RequestBody Todo todo){
        if(todo.getId() != null) {
            return service.save(todo);
        }
        throw new RuntimeException("No existe el id para actualizar");
    }

    @DeleteMapping(value = "api/{id}/todo")
    public void delete(@PathVariable Long id){
        service.delete(id); //AQUÍ SE PUEDE RECIBIR DIRECTAMENTE EL ID
    }

    @GetMapping(value = "api/{id}/todo")
    public Todo get(@PathVariable Long id)  //@PathVariable para definir que lo estamos esperando en el http
    {
        return service.get(id);
    }

}
