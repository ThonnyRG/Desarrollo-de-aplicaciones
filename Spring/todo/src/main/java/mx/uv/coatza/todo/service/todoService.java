package mx.uv.coatza.todo.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid; // Importación de la anotación @Valid
import mx.uv.coatza.todo.dto.CreateTodoDTO;
import mx.uv.coatza.todo.dto.TodoDTO;
import mx.uv.coatza.todo.model.todo;

@Service // Anotación para indicar que esta clase es un servicio de Spring
public class todoService {

    private List<todo> todos; // Lista para almacenar las tareas
    private int currentId = 1; // Variable para generar el ID de las tareas

    // Constructor de la clase
    public todoService() {
        // Inicialización de la lista de tareas y agregando una tarea de ejemplo
        this.todos = new LinkedList<>();
        todos.add(new todo(1, "ola", "Eduardo", false));
    }

    // Método para crear una nueva tarea
    public todo create(@Valid CreateTodoDTO data) {
        // Creación de una nueva tarea a partir de los datos proporcionados
        todo model = new todo(++currentId, data.getTitle(), data.getDescription(), false);
        todos.add(model); // Agregar la nueva tarea a la lista de tareas

        return model; // Retornar la nueva tarea creada
    }

    // Método para obtener todas las tareas
    public List<TodoDTO> getAll() {
        List<TodoDTO> data = new LinkedList<>(); // Lista para almacenar los DTO de las tareas

        // Convertir cada tarea en un DTO y agregarlo a la lista de DTOs
        for (todo model : todos) {
            TodoDTO dto = new TodoDTO();
            dto.setId(model.getId());
            dto.setTitle(model.getTitle());
            dto.setDescription(model.getDescription());
            dto.setCompleted(model.isCompleted());
            data.add(dto);
        }
        return data; // Retornar la lista de DTOs de tareas
    }
}
