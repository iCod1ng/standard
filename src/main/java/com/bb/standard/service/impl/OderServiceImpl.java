package com.bb.standard.service.impl;

import com.bb.standard.bean.dto.OrderDTO;
import com.bb.standard.config.abstractclass.order.AbstractHandler;
import com.bb.standard.config.annotation.order.HandlerContext;
import com.bb.standard.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OderServiceImpl implements IOrderService {


    @Autowired
    private HandlerContext handlerContext;


    @Override
    public String handle(OrderDTO dto) {
        AbstractHandler handler = handlerContext.getInstance(dto.getType());
        return handler.handle(dto);
    }
}
