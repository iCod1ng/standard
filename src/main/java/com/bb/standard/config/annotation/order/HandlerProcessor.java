package com.bb.standard.config.annotation.order;

import cn.hutool.core.lang.ClassScanner;
import com.bb.standard.common.OrderEnum;
import com.google.common.collect.Maps;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@SuppressWarnings("unchecked")
public class HandlerProcessor implements BeanFactoryPostProcessor {

    private static final String HANDLER_PACKAGE = "com.bb.standard.service.handler";

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        Map<OrderEnum,Class> handlerMap = Maps.newHashMapWithExpectedSize(3);
        ClassScanner.scanPackageByAnnotation(HANDLER_PACKAGE,HandlerType.class).forEach(aClass -> {
            OrderEnum type = aClass.getAnnotation(HandlerType.class).value();
            handlerMap.put(type,aClass);
        });

        HandlerContext context = new HandlerContext(handlerMap);
        configurableListableBeanFactory.registerSingleton(HandlerContext.class.getName(),context);

    }
}
