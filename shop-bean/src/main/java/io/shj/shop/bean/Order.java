package io.shj.shop.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {

    private static final long serialVersionUID = -6606551863394843824L;
    private Long id;
    private Long userId;
    private String username;
    private String phone;
    private String address;
    private BigDecimal totalPrice;


}
