package com.bb.standard.config.annotation.order;

import com.bb.standard.common.OrderEnum;
import com.bb.standard.config.abstractclass.order.AbstractHandler;
import com.bb.standard.utils.Bean.BeanTool;

import java.util.Map;

public class HandlerContext {
    private Map<OrderEnum,Class> handlerMap;

    public HandlerContext(Map<OrderEnum,Class> handlerMap){
        this.handlerMap = handlerMap;
    }

    public AbstractHandler getInstance(OrderEnum type){
        Class clazz = handlerMap.get(type);
        if(clazz == null){
            throw new IllegalArgumentException("not found handler for type: "+type);
        }
        return (AbstractHandler) BeanTool.getBean(clazz);
    }
}
