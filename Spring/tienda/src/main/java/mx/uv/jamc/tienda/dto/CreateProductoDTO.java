package mx.uv.jamc.tienda.dto;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


public class CreateProductoDTO {
    @NotBlank(message = "El nombre es obligatorio")
    private String name;

    @Min(value = 1, message = "La cantidad debe ser mayor a 0")
    private int quantity;

    @DecimalMin(value = "0.0", message = "La cantidad debe ser mayor a 0")
    private double price;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    
}
