package mx.uv.jamc.tienda.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.uv.jamc.tienda.dto.CreateProductoDTO;
import mx.uv.jamc.tienda.dto.ProductDTO;
import mx.uv.jamc.tienda.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/trucoTeca")
    public List<ProductDTO> getAll(){
        return productService.getAll();
    }
    @RequestMapping("/createProductos")
    public ProductDTO save(@Valid @RequestBody CreateProductoDTO data){
        return productService.save(data);
    }
}
