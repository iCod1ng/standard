package com.bb.standard.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bb.standard.bean.entity.UserView;
import com.bb.standard.service.IUserViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * VIEW 前端控制器
 * </p>
 *
 * @author bb
 * @since 2019-09-01
 */
@Controller
@RequestMapping("/user-view")
public class UserViewController {
    @Autowired
    private IUserViewService userViewService;

    @RequestMapping("/page")
    @ResponseBody
    public Page<UserView> page(Page<UserView> page,String type,String orderType){
        return userViewService.selectPage(page,type,orderType);
    }

    @RequestMapping("/pageWrapper")
    @ResponseBody
    public IPage<UserView> pageWrapper(){
        IPage<UserView> page = userViewService.page(new Page<>(1,5),Wrappers.<UserView>query().orderByDesc("username"));
        return page;
    }

}
