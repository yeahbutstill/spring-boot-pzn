package com.yeahbutstill.learnspring.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cart {

    private Product product;
    private Category category;
    private Address address;

}
