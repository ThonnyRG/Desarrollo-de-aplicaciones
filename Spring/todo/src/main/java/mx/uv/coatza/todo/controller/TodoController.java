package mx.uv.coatza.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import mx.uv.coatza.todo.dto.CreateTodoDTO;
import mx.uv.coatza.todo.dto.TodoDTO;
import mx.uv.coatza.todo.model.todo;
import mx.uv.coatza.todo.service.todoService;

@RestController
public class TodoController {
    
    @Autowired
    private todoService TodoService;

    @RequestMapping("/trucoteca")
    public List<TodoDTO> getAll(){
        return TodoService.getAll();
    }

    @RequestMapping("/crearTodo")
    public todo create(@Valid @RequestBody CreateTodoDTO data){
        return TodoService.create(data);
    }
}
