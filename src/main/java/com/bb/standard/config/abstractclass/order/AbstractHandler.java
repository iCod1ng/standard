package com.bb.standard.config.abstractclass.order;

import com.bb.standard.bean.dto.OrderDTO;

public abstract class AbstractHandler {
    abstract public String handle(OrderDTO dto);
}
