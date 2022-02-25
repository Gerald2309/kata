package co.com.sofka.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    //INSTAR TODOS LOS ELEMENTOS
    public Iterable <Todo> list()
    {
        return repository.findAll();
    }

    public Todo save(Todo todo){
        return repository.save(todo);
    }

    public void delete(Long id){
        repository.delete(get(id)); //ESTAMOS REUTILIZANDO EL GET DE ABAJO
    }

    public Todo get(Long id)
    {
        //No se puede hacer como los otros porque el id debe existir necesariamente
        //Por lo tanto se le hace un Throw/exception
        return repository.findById(id).orElseThrow();
    }
}





