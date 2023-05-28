package io.shj.shop.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem implements Serializable {

    private static final long serialVersionUID = -3972145532903572008L;
    private Long id;
    private Long orderId;
    private Long proId;
    private String proName;
    private BigDecimal proPrice;
    private Integer number;

}
