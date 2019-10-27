package com.bb.standard.config.annotation.order;

import com.bb.standard.common.OrderEnum;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface HandlerType {
    OrderEnum value();
}
