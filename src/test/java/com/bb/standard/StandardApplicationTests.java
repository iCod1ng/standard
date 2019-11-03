package com.bb.standard;

import com.bb.standard.bean.dto.OrderDTO;
import com.bb.standard.service.IOrderService;
import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StandardApplicationTests {


    @Autowired
    private IOrderService orderService;

    @Test
    public void contextLoads() {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();

        textEncryptor.setPassword("bb@1995intheforest");

        String envName = textEncryptor.encrypt("dev");
        String envConfig = textEncryptor.encrypt("127.0.0.1:8081");
        System.out.println("name: "+envName);
        System.out.println("config: "+envConfig);

    }


    @Test
    public void handler(){
        OrderDTO order = createOrder("2");
        String res = handleOrder(order);
        Assert.assertEquals("处理普通订单",res);



    }

    private OrderDTO createOrder(String type){
        OrderDTO order = new OrderDTO();
        order.setType(type);
        return order;
    }

    private String handleOrder(OrderDTO orderDTO){
        return orderService.handle(orderDTO);
    }

}
