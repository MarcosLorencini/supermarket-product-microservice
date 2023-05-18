package com.supermarket.product.microservice.repository;

import com.supermarket.product.microservice.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    Product findByProductId(Integer productId);
}
