package ca.georgebrown.comp3095.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document(value = "product")

@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Product {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;
    private String image;

}
