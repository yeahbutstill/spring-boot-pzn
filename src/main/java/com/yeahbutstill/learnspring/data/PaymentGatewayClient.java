package com.yeahbutstill.learnspring.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentGatewayClient {
    private String endPoint;
    private String publicKey;
    private String privateKey;
}
