package com.yeahbutstill.learnspring;

import com.yeahbutstill.learnspring.data.Address;
import com.yeahbutstill.learnspring.data.Cart;
import com.yeahbutstill.learnspring.data.Category;
import com.yeahbutstill.learnspring.data.Product;
import com.yeahbutstill.learnspring.qualifierdi.QualifierDi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QualifierDITest {

    ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(QualifierDi.class);
    }

    @Test
    void testDi() {

        Product product = applicationContext.getBean("secondProduct", Product.class);
        Category category = applicationContext.getBean(Category.class);
        Address address = applicationContext.getBean(Address.class);
        Cart cart = applicationContext.getBean(Cart.class);

        Assertions.assertSame(product, cart.getProduct());
        Assertions.assertSame(category, cart.getCategory());
        Assertions.assertSame(address, cart.getAddress());

    }

}
