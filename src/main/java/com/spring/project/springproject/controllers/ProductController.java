package com.spring.project.springproject.controllers;

import com.spring.project.springproject.models.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {

    private Product product;

    @RequestMapping("/casotto")
    public Product index() {
        product = new Product("CasottoProduct", 1300.00);
        return product;
    }
}
