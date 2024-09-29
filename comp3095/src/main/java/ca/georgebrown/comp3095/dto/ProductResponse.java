package ca.georgebrown.comp3095.dto;

import java.math.BigDecimal;

public record ProductResponse(

    String id,
    String name,
    String description,
    BigDecimal price,
    int quantity,
    String image
)
{}

