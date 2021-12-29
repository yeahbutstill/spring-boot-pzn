package com.yeahbutstill.learnspring;

import com.yeahbutstill.learnspring.bean.BeanDependencyInjection;
import com.yeahbutstill.learnspring.data.Address;
import com.yeahbutstill.learnspring.data.Cart;
import com.yeahbutstill.learnspring.data.Category;
import com.yeahbutstill.learnspring.data.Product;
import lombok.var;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {

    ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(BeanDependencyInjection.class);
    }

    @Test
    void testNoDI() {
        var product = new Product();
        var category = new Category();
        var address = new Address();

        var cart = new Cart(product, category, address);

        Assertions.assertSame(product, cart.getProduct());
        Assertions.assertSame(category, cart.getCategory());
    }

    @Test
    void testDi() {

        Product product = applicationContext.getBean(Product.class);
        Category category = applicationContext.getBean(Category.class);
        Address address = applicationContext.getBean(Address.class);
        Cart cart = applicationContext.getBean(Cart.class);

        Assertions.assertSame(product, cart.getProduct());
        Assertions.assertSame(category, cart.getCategory());

    }
}
