package com.yeahbutstill.learnspring.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CyclicB {
    private CyclicC cyclicC;
}
