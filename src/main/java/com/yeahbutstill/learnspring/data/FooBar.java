package com.yeahbutstill.learnspring.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FooBar {
    private Foo foo;
    private Bar bar;
}
