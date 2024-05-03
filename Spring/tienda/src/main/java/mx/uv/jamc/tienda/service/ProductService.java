package mx.uv.jamc.tienda.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.uv.jamc.tienda.dto.CreateProductoDTO;
import mx.uv.jamc.tienda.dto.ProductDTO;
import mx.uv.jamc.tienda.model.Product;
import mx.uv.jamc.tienda.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDTO> getAll() {
        List<Product> products = productRepository.getAll();
        return products.stream()
                       .map(this::toDTO)
                       .collect(Collectors.toList());
    }

    public ProductDTO save(CreateProductoDTO data){
        Product model = toModel(data);
        return toDTO(productRepository.save(model));
    }

    private Product toModel(CreateProductoDTO dto){
        return new Product(0, dto.getName(), dto.getQuantity(), dto.getPrice());
    }

    private ProductDTO toDTO(Product model){
        return new ProductDTO(model.getId(), model.getName(), model.getQuantity(), model.getPrice());
    }
}
