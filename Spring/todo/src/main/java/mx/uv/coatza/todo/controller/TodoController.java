package mx.uv.coatza.todo.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.uv.coatza.todo.model.todo;

@RestController
public class TodoController {
    private List<todo> todos;

    public TodoController(){
        todos = new LinkedList<>();

        todos.add(new todo(1,"ola","Eduardo",false));
    }
    @RequestMapping("/trucoteca")
    public List<todo> getAll(){
        return todos;
    }

    
}
