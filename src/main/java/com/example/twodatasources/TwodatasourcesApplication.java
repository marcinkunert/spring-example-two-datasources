package com.example.twodatasources;

import com.example.twodatasources.product.Product;
import com.example.twodatasources.product.ProductRepository;
import com.example.twodatasources.user.User;
import com.example.twodatasources.user.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TwodatasourcesApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TwodatasourcesApplication.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);
        User user = new User();
        user.setName("Pan Kracy");
        userRepository.save(user);

        ProductRepository productRepository = context.getBean(ProductRepository.class);
        Product product = new Product();
        product.setName("Masło");
        productRepository.save(product);
    }

}
