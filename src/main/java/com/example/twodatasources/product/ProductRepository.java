package com.example.twodatasources.product;


import com.example.twodatasources.ProductEntity;
import com.example.twodatasources.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
@ProductEntity
public interface ProductRepository extends JpaRepository<Product, Long> {
}
