package com.yeahbutstill.learnspring.bean;

import com.yeahbutstill.learnspring.data.Cart;
import com.yeahbutstill.learnspring.data.Category;
import com.yeahbutstill.learnspring.data.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDependencyInjection {

    @Bean
    public Product product() {
        return new Product();
    }

    @Bean
    public Category category() {
        return new Category();
    }

    @Bean
    public Cart cart(Product product, Category category) {
        return new Cart(product, category);
    }

}
