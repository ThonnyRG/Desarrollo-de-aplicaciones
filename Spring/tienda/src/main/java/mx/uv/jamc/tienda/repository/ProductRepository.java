package mx.uv.jamc.tienda.repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import mx.uv.jamc.tienda.model.Product;

public class ProductRepository {
    private long currentID;
    private List<Product> products;

    public ProductRepository(long currentID, List<Product> products) {
        currentID = 1;
        products = new LinkedList<>();
    }

    public Product save(Product data){
        data.setId(currentID);
        products.add(data);

        return data;
    }

    public Product getByID(long id){
        Product data = null;

        for (Product product : products){
            if (product.getId() == id){
                data = product;
                break;
            }
           
        } 
        return data;
    }

    public Optional<Product> getById(long id){
        for (Product product : products){
            if(product.getId() == id){
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    public void update(long id, Product data){
        Optional<Product> entry = getById(id);

        if (!entry.isPresent()) {
            return;
        }

        Product product = entry.get();

        if (data.getName() != null) {
            product.setName(data.getName());
        }

        if (data.getPrice() > 0) {
            product.setPrice(data.getPrice());
        }
        if (data.getQuantity() > 0) {
            product.setQuantity(data.getQuantity());
        }
    }

    public List<Product> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
}
