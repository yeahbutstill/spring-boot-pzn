package com.yeahbutstill.learnspring;

import com.yeahbutstill.learnspring.configur.ComponentConfiguration;
import com.yeahbutstill.learnspring.repository.CategoryRepository;
import com.yeahbutstill.learnspring.repository.ProductRepository;
import com.yeahbutstill.learnspring.service.CategoryService;
import com.yeahbutstill.learnspring.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {

    private ConfigurableApplicationContext configurableApplicationContext;

    @BeforeEach
    void setUp() {
        configurableApplicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        configurableApplicationContext.registerShutdownHook();
    }

    @Test
    void testComponent() {
        ProductService productService1 = configurableApplicationContext.getBean(ProductService.class);
        ProductService productService2 = configurableApplicationContext.getBean("productService", ProductService.class);

        Assertions.assertSame(productService1, productService2);
    }

    @Test
    void testConstructorDependencyInjections() {
        ProductService productService = configurableApplicationContext.getBean(ProductService.class);
        ProductRepository productRepository = configurableApplicationContext.getBean(ProductRepository.class);

        Assertions.assertSame(productRepository, productService.getProductRepository());
    }

    @Test
    void testSetterDI() {
        CategoryService categoryService = configurableApplicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = configurableApplicationContext.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
    }
}
