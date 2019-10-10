package com.bb.standard.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bb.standard.bean.entity.User;
import com.bb.standard.bean.entity.UserView;
import com.bb.standard.service.IUserService;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bb
 * @since 2019-09-01
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/u")
    @ResponseBody
    public List<User> all(){

        return userService.list(new QueryWrapper<User>().lambda().eq(User::getAnswer,"答案"));
    }


    @RequestMapping("/pluginPage")
    @ResponseBody
    public IPage<User> pageByPlugin(){
        Page<User> page = new Page<>();
        List<OrderItem> orderItemList = new ArrayList<>();
        OrderItem orderItem = new OrderItem();

        orderItem.setColumn("username");
        orderItem.setAsc(false);

        orderItemList.add(orderItem);

        page.setOrders(orderItemList);


        page = (Page<User>) userService.page(page,new QueryWrapper<User>().lambda().eq(User::getId,28));
        return page;
    }

    @RequestMapping("/page")
    @ResponseBody
    public IPage<User> page(){

        IPage<User> page = userService.page(new Page<>(1,5),Wrappers.<User>query().orderByDesc("username"));
        //IPage<Map<String, Object>> page = userService.pageMaps(new Page<>(1, 5), Wrappers.<User>query().orderByDesc("username"));

        return page;
    }

    @RequestMapping("/pageWrapper")
    @ResponseBody
    public IPage<User> pageWrapper(){
        IPage<User> page = userService.page(new Page<>(1,5),Wrappers.<User>query().eq("answer","答案").orderByDesc("username"));
        return page;
    }

}
