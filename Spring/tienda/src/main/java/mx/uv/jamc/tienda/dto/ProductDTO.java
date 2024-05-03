package mx.uv.jamc.tienda.dto;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;

public class ProductDTO {
    private long id;

    @NotBlank
    private String name;

    @DecimalMin("0.0")
    private int quantity;
    private double price;

    

    public ProductDTO(long id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
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
