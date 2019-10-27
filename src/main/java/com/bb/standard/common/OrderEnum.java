package com.bb.standard.common;

import cn.hutool.core.util.EnumUtil;
import cn.hutool.core.util.StrUtil;
import com.bb.standard.bean.dto.OrderDTO;
import com.bb.standard.common.exception.NoSuchOrderType;
import com.bb.standard.service.impl.OderServiceImpl;

import java.util.Arrays;
import java.util.Optional;

public enum OrderEnum {

    EXCEPTION_TYPE("订单类型异常","-1"),
    NORMAL("普通订单","1"),
    GROUP("团购订单","2");

    private String name;
    private String code;



    OrderEnum(String name,String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public static OrderEnum getOrderEnumByOrder(OrderDTO order){
        OrderEnum orderEnum ;
        try{
            orderEnum = OrderEnum.valueOf(order.getType());
        }catch (Exception e){
            throw new NoSuchOrderType("No such Order Type： "+order.getType());
        }
        return orderEnum;
    }

    public static OrderEnum codeOf(String code){
        OrderEnum[] orderEnums = OrderEnum.values();
        Optional<OrderEnum>  orderEnumOption = Arrays.stream(orderEnums).filter(orderEnum -> orderEnum.getCode().equals(code)).findFirst();
        return orderEnumOption.orElse(OrderEnum.EXCEPTION_TYPE);
    }

    public static void main(String[] args) {
        System.out.println(codeOf(""));
    }

}
