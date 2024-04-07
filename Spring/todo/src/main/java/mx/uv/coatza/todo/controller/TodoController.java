package mx.uv.coatza.todo.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import mx.uv.coatza.todo.dto.CreateTodoDTO;
import mx.uv.coatza.todo.dto.TodoDTO;
import mx.uv.coatza.todo.model.todo;

@RestController
public class TodoController {
    private List<todo> todos;
    private int currentId = 1;
    
    public TodoController(){
        todos = new LinkedList<>();

        todos.add(new todo(1,"ola","Eduardo",false));
    }
    @RequestMapping("/trucoteca")
    public List<TodoDTO> getAll(){
        List<TodoDTO> data = new LinkedList<>();
        for(todo model : todos){
            TodoDTO dto = new TodoDTO();
            dto.setId(model.getId());
            dto.setTitle(model.getTitle());
            dto.setDescription(model.getDescription());
            dto.setCompleted(model.isCompleted());
            data.add(dto);
        }
        
        return data;
    }
    @RequestMapping("/crearTodo")
    public todo create(@Valid @RequestBody CreateTodoDTO data){

        // Conversión de DTO a model (model es cómo almaceno los datos)
        //Dto es como los reivo y como los regreso desde controlador 

        todo model = new todo(++currentId, data.getTitle(), data.getDescription(), false);
        todos.add(model);
        
        TodoDTO dto = new TodoDTO();
        dto.setId(model.getId());
        dto.setTitle(model.getTitle());
        dto.setDescription(model.getDescription());
        dto.setCompleted(model.isCompleted());

        return model;

    }
}
