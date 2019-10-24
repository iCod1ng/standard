package com.bb.standard.bean.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderDTO {

    private String code;

    private BigDecimal price;

    private String type;
}
