package ca.georgebrown.comp3095.service;

import ca.georgebrown.comp3095.dto.ProductRequest;
import ca.georgebrown.comp3095.dto.ProductResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductResponse createProduct(ProductRequest productRequest) {
        return null;
    }

    @Override
    public List<ProductResponse> getAllProducts() {
        return List.of();
    }

    @Override
    public <string> String updateProduct(string productId, ProductRequest ProductRequest) {
        return "";
    }

    @Override
    public void deleteProduct(String productId) {

    }

    @Override
    public ProductResponse getProduct(String productId) {
        return null;
    }
}
