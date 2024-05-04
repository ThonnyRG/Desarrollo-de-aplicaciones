package mx.uv.jamc.tienda.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.uv.jamc.tienda.dto.CreateProductDTO;
import mx.uv.jamc.tienda.dto.ProductDTO;
import mx.uv.jamc.tienda.mapper.ProductMapper;
import mx.uv.jamc.tienda.model.Product;
import mx.uv.jamc.tienda.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;


    public List<ProductDTO> getAll() {
        List<Product> products = productRepository.getAll();
        List<ProductDTO> data = new LinkedList<>();

        for (Product product : products) {
            data.add(productMapper.toDTO(product));
        }
        return data;
    }

    public ProductDTO save(CreateProductDTO data) {
        Product model = productMapper.toModel(data);
        return productMapper.toDTO(productRepository.save(model));

    }

    /* 
    private Product toModel(CreateProductDTO dto) {
        return new Product(0, dto.getName(), dto.getQuantity(), dto.getPrice());
    }


    private Product toModel(ProductDTO dto) {
        return new Product(dto.getId(), dto.getName(), dto.getQuantity(), dto.getPrice());
    }

    
    private ProductDTO toDTO(Product model) {
        return new ProductDTO(model.getId(), model.getName(), model.getQuantity(), model.getPrice());
    } */

}
