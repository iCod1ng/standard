package com.bb.standard.service.handler;

import com.bb.standard.bean.dto.OrderDTO;
import com.bb.standard.config.abstractclass.order.AbstractHandler;
import com.bb.standard.config.annotation.order.HandlerType;
import org.springframework.stereotype.Component;

@Component
@HandlerType("2")
public class GroupHandler extends AbstractHandler {

    @Override
    public String handle(OrderDTO dto) {
        return "处理团购订单";
    }
}
