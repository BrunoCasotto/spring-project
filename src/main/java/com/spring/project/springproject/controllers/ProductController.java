package com.spring.project.springproject.controllers;

import com.spring.project.springproject.models.Product;
import com.spring.project.springproject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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

    @RequestMapping(path="/product/getBySku/{sku}", method=GET)
    public ResponseEntity<Product> view(@PathVariable String sku){
        product = repository.findOne(sku);

        if(Objects.isNull(product)){
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(product);
        }
    }

    @RequestMapping(value = "product", method=POST,
            consumes = "application/json")
    public ResponseEntity<Product> saveProduct(@RequestParam(value="sku", required=true) final String sku,
                               @RequestParam(value="name", required=true) final String name,
                               @RequestParam(name = "price", required = true) final Double price,
                               @RequestParam(name = "category", required = true) final String category) {
        product = new Product(sku.toString(), name.toString(), 100.00, category.toString());
        return ResponseEntity.ok(repository.insert(product));
    }
}
