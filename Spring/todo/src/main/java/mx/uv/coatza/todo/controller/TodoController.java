//Comando para ejecutar: ./gradlew bootrun
package mx.uv.coatza.todo.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Importación de las anotaciones de validación
import jakarta.validation.Valid;
// Importación de los DTO (Data Transfer Object) y el modelo (todo)
import mx.uv.coatza.todo.dto.CreateTodoDTO;
import mx.uv.coatza.todo.dto.TodoDTO;
import mx.uv.coatza.todo.model.todo;

@RestController // Anotación para indicar que esta clase es un controlador REST
public class TodoController {
    private List<todo> todos; // Lista para almacenar las tareas
    private int currentId = 1; // Variable para generar el ID de las tareas

    // Constructor de la clase
    public TodoController(){
        todos = new LinkedList<>(); // Inicialización de la lista de tareas

        // Se agrega una tarea de ejemplo a la lista
        todos.add(new todo(1,"ola","Eduardo",false));
    }

    // Endpoint para obtener todas las tareas
    @RequestMapping("/trucoteca")
    public List<TodoDTO> getAll(){

        List<TodoDTO> data = new LinkedList<>(); // Lista para almacenar los DTO de las tareas

        // Se recorre la lista de tareas y se convierten a DTO
        for(todo model : todos){
            TodoDTO dto = new TodoDTO();
            dto.setId(model.getId());
            dto.setTitle(model.getTitle());
            dto.setDescription(model.getDescription());
            dto.setCompleted(model.isCompleted());
            data.add(dto); // Se agrega el DTO a la lista de DTOs
        }

        return data; // Se retorna la lista de DTOs
    }

    // Endpoint para crear una nueva tarea
    @RequestMapping("/crearTodo")
    public todo create(@Valid @RequestBody CreateTodoDTO data){

        // Se crea una nueva tarea a partir de los datos recibidos
        todo model = new todo(++currentId, data.getTitle(), data.getDescription(), false);
        todos.add(model); // Se agrega la nueva tarea a la lista de tareas

        // Se crea un DTO para la nueva tarea
        TodoDTO dto = new TodoDTO();
        dto.setId(model.getId());
        dto.setTitle(model.getTitle());
        dto.setDescription(model.getDescription());
        dto.setCompleted(model.isCompleted());

        return model; // Se retorna la nueva tarea
    }
}
