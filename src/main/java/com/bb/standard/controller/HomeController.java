package com.bb.standard.controller;

import com.bb.standard.bean.dto.OrderDTO;
import com.bb.standard.bean.entity.User;
import com.bb.standard.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @author yanyuchi
 * @date 2019-08-29 20:19
 */

@RestController
public class HomeController {

    @Autowired
    @Qualifier("OKSpringCommonsRestTemplate")
    private RestTemplate okRestTemplate;

    @Autowired
    private IOrderService orderService;

    @GetMapping("/http")
    public String http(){
        final String  uri = "http://localhost:8081/user/u";

        //RestTemplate restTemplate = new RestTemplate();
        User[] result = okRestTemplate.getForObject(uri,User[].class);
        List<User> userList = Arrays.asList(result);
        userList.forEach(item-> System.out.println(item));
        return "OK";
    }

    @GetMapping("/handle")
    public String handle(String type){
        OrderDTO dto = new OrderDTO();
        dto.setCode("1");
        dto.setType(type);
        String res = orderService.handle(dto);
        return res;
    }
}
