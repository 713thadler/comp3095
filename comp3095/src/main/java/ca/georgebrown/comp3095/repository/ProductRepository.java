package ca.georgebrown.comp3095.repository;

import ca.georgebrown.comp3095.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {


}
