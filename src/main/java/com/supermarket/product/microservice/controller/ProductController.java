package com.supermarket.product.microservice.controller;


import com.netflix.discovery.converters.Auto;
import com.supermarket.product.microservice.domain.Product;
import com.supermarket.product.microservice.repository.ProductRepository;
import com.supermarket.product.microservice.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    TicketService ticketService;

    @GetMapping(value = "/product")
    public Iterable<Product> all (){
        return productRepository.findAll();
    }

    @GetMapping(value = "/product/{productId}")
    public Product findByAccountId (@PathVariable Integer productId){

        Product produto = productRepository.findByProductId(productId);

        produto.setTicket(ticketService.findByProductId(productId));

        return produto;
    }



}
