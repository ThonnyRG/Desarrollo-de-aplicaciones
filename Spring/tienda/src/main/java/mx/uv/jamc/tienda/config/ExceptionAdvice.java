package mx.uv.jamc.tienda.config;

import java.util.LinkedList;
import java.util.List;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import mx.uv.jamc.tienda.dto.ErrorDTO;

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorDTO validationErrors(MethodArgumentNotValidException ex) {
        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
        List<String> errors = new LinkedList<>();

        for (FieldError fieldError : fieldErrors) {
            errors.add(fieldError.getDefaultMessage());
        }

        // Construye el mensaje de error utilizando la lista de errores
        String errorMessage = "Errores de validación: " + String.join(", ", errors);

        return new ErrorDTO("LIS01", errorMessage, null);
    }
}
