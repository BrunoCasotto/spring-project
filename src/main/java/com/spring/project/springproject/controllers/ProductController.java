package com.spring.project.springproject.controllers;

import com.spring.project.springproject.models.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController
public class ProductController {

    private Product product;

    @RequestMapping(value = "product", method=GET)
    public Product getProduct() {
        product = new Product("CasottoProduct", 1300.00);
        System.out.println("calling GET");
        return product;
    }

    @RequestMapping(value = "product", method=POST)
    public Product saveProduct() {
        product = new Product("CasottoProduct", 1300.00);
        System.out.println("calling POST");
        return product;
    }
}
