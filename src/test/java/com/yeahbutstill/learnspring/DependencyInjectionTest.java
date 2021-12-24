package com.yeahbutstill.learnspring;

import com.yeahbutstill.learnspring.data.Cart;
import com.yeahbutstill.learnspring.data.Category;
import com.yeahbutstill.learnspring.data.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DependencyInjectionTest {

    @Test
    void testNoDI() {
        var product = new Product();
        var category = new Category();

        var cart = new Cart(product, category);

        Assertions.assertSame(product, cart.getProduct());
        Assertions.assertSame(category, cart.getCategory());
    }
}
