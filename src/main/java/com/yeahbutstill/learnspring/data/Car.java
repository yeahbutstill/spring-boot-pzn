package com.yeahbutstill.learnspring.data;

import com.yeahbutstill.learnspring.aware.IdAware;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Car implements IdAware {

    private String id;

}
