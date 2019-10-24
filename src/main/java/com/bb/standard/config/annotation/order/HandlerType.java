package com.bb.standard.config.annotation.order;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface HandlerType {
    String value();
}
