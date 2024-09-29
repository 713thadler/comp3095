package ca.georgebrown.comp3095.service;

import ca.georgebrown.comp3095.dto.ProductRequest;
import ca.georgebrown.comp3095.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    ProductResponse createProduct(ProductRequest productRequest);
    List<ProductResponse> getAllProducts();
    <string> String updateProduct(string productId, ProductRequest ProductRequest);
    void deleteProduct(String productId);
    ProductResponse getProduct(String productId);

}
