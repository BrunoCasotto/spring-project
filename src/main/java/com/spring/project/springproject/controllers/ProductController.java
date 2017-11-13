package com.spring.project.springproject.controllers;

import com.spring.project.springproject.models.Product;
import com.spring.project.springproject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController
public class ProductController {

    private Product product;

    @Autowired
    private ProductRepository repository;

    @RequestMapping(value = "product", method=GET)
    public ResponseEntity<?> list() {
        List<Product> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @RequestMapping(path="/product/{name}", method=GET)
    public ResponseEntity<Product> view(@PathVariable String name){
        Product product = repository.findOne(name);

        if(Objects.isNull(product)){
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(product);
        }
    }

    @RequestMapping(value = "product", method=POST)
    public Product saveProduct() {
        product = new Product("CasottoProduct", 1300.00);
        System.out.println("calling POST");
        return product;
    }
}
