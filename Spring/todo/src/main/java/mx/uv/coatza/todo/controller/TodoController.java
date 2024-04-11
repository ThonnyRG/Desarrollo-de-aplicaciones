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

@RestController // Anotación para indicar que esta clase es un controlador REST
public class TodoController {
    
    @Autowired // Anotación para inyectar una instancia de todoService automáticamente
    private todoService TodoService;

    // Endpoint para obtener todas las tareas
    @RequestMapping("/trucoteca")
    public List<TodoDTO> getAll(){
        return TodoService.getAll(); // Retorna todas las tareas obtenidas del servicio
    }

    // Endpoint para crear una nueva tarea
    @RequestMapping("/crearTodo")
    public todo create(@Valid @RequestBody CreateTodoDTO data){
        return TodoService.create(data); // Crea una nueva tarea utilizando los datos proporcionados y retorna la tarea creada
    }
}