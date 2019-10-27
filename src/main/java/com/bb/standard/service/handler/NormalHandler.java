package com.bb.standard.service.handler;

import cn.hutool.core.util.EnumUtil;
import com.bb.standard.bean.dto.OrderDTO;
import com.bb.standard.common.OrderEnum;
import com.bb.standard.config.abstractclass.order.AbstractHandler;
import com.bb.standard.config.annotation.order.HandlerType;
import com.google.common.collect.Maps;
import org.apache.commons.lang.enums.EnumUtils;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@HandlerType(OrderEnum.NORMAL)
public class NormalHandler extends AbstractHandler {
    @Override
    public String handle(OrderDTO dto) {
        return "处理普通订单";
    }


    public static void main(String[] args) {
        Map<OrderEnum,String> enumMap = Maps.newHashMap();
        enumMap.put(OrderEnum.NORMAL,"NORMAL");
        enumMap.put(OrderEnum.GROUP,"GROUP");


        System.out.println(enumMap.get(OrderEnum.GROUP));

        System.out.println(enumMap.get(OrderEnum.NORMAL));
    }
}
