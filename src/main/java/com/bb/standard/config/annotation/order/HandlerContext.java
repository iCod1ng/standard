package com.bb.standard.config.annotation.order;

import com.bb.standard.config.abstractclass.order.AbstractHandler;
import com.bb.standard.utils.Bean.BeanTool;

import java.util.Map;

public class HandlerContext {
    private Map<String,Class> handlerMap;

    public HandlerContext(Map<String,Class> handlerMap){
        this.handlerMap = handlerMap;
    }

    public AbstractHandler getInstance(String type){
        Class clazz = handlerMap.get(type);
        if(clazz == null){
            throw new IllegalArgumentException("not found handler for type: "+type);
        }
        return (AbstractHandler) BeanTool.getBean(clazz);
    }
}