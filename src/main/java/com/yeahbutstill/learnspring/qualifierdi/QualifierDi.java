package com.yeahbutstill.learnspring.qualifierdi;

import com.yeahbutstill.learnspring.data.Address;
import com.yeahbutstill.learnspring.data.Cart;
import com.yeahbutstill.learnspring.data.Category;
import com.yeahbutstill.learnspring.data.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class QualifierDi {

    @Primary
    @Bean
    public Product newProduct() {
        return new Product();
    }

    @Bean
    public Product secondProduct() {
        return new Product();
    }

    @Bean
    public Category category() {
        return new Category();
    }

    @Bean
    public Address Address() {
        return new Address();
    }

    @Bean
    public Cart cart(@Qualifier("secondProduct") Product product, Category category, Address address) {
        return new Cart(product, category, address);
    }

}
