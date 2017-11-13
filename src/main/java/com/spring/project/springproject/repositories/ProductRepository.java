package com.spring.project.springproject.repositories;
import com.spring.project.springproject.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
