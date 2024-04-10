package mx.uv.coatza.todo.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
import mx.uv.coatza.todo.dto.CreateTodoDTO;
import mx.uv.coatza.todo.dto.TodoDTO;
import mx.uv.coatza.todo.model.todo;

@Service
public class todoService {

    private List<todo> todos;
    private int currentId = 1;

    public todoService() {
        this.todos = new LinkedList<>();
        todos.add(new todo(1,"ola","Eduardo",false));
    }

    public todo create(@Valid CreateTodoDTO data){
        todo model = new todo(++currentId, data.getTitle(), data.getDescription(), false);
        todos.add(model);

        return model;
    }

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
}
