package mx.uv.jamc.tienda.mapper;

import javax.annotation.processing.Generated;
import mx.uv.jamc.tienda.dto.CreateProductDTO;
import mx.uv.jamc.tienda.dto.ProductDTO;
import mx.uv.jamc.tienda.model.Product;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-04T09:01:05-0600",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.7.jar, environment: Java 17.0.9 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDTO toDTO(Product model) {
        if ( model == null ) {
            return null;
        }

        long id = 0L;
        String name = null;
        int quantity = 0;
        double price = 0.0d;

        id = model.getId();
        name = model.getName();
        quantity = model.getQuantity();
        price = model.getPrice();

        ProductDTO productDTO = new ProductDTO( id, name, quantity, price );

        return productDTO;
    }

    @Override
    public Product toModel(CreateProductDTO dto) {
        if ( dto == null ) {
            return null;
        }

        int quantity = 0;
        String name = null;
        double price = 0.0d;

        quantity = dto.getStock();
        name = dto.getName();
        price = dto.getPrice();

        long id = 0L;

        Product product = new Product( id, name, quantity, price );

        return product;
    }
}
