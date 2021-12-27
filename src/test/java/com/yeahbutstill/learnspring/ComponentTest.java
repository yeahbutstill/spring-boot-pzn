package com.yeahbutstill.learnspring;

import com.yeahbutstill.learnspring.configur.ComponentConfiguration;
import com.yeahbutstill.learnspring.repository.CategoryRepository;
import com.yeahbutstill.learnspring.repository.CustomerRepository;
import com.yeahbutstill.learnspring.repository.ProductRepository;
import com.yeahbutstill.learnspring.service.CategoryService;
import com.yeahbutstill.learnspring.service.CustomerService;
import com.yeahbutstill.learnspring.service.ProductService;
import objectprovider.MultiFoo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ComponentTest {

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

    @Test
    void testFieldDI() {
        CustomerService customerService = configurableApplicationContext.getBean(CustomerService.class);
        CustomerRepository normalCustomerRepository = configurableApplicationContext.getBean("normalCustomerRepository", CustomerRepository.class);
        CustomerRepository premiumCustomerRepository = configurableApplicationContext.getBean("premiumCustomerRepository", CustomerRepository.class);

        Assertions.assertSame(normalCustomerRepository, customerService.getNormalCustomerRepository());
        Assertions.assertSame(premiumCustomerRepository, customerService.getPremiumCustomerRepository());
    }

    @Test
    void testObjectProvider() {
        MultiFoo multiFoo = configurableApplicationContext.getBean(MultiFoo.class);
        Assertions.assertEquals(3, multiFoo.getFoos().size());
    }
}
