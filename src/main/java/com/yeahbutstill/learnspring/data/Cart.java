package com.yeahbutstill.learnspring.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Cart {

    private Product product;
    private Category category;

}
