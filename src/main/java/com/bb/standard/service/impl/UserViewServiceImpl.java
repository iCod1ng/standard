package com.bb.standard.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bb.standard.bean.entity.UserView;
import com.bb.standard.mapper.UserViewMapper;
import com.bb.standard.service.IUserViewService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * VIEW 服务实现类
 * </p>
 *
 * @author bb
 * @since 2019-09-01
 */
@Service
public class UserViewServiceImpl extends ServiceImpl<UserViewMapper, UserView> implements IUserViewService {

    @Autowired
    private UserViewMapper userViewMapper;

    @Override
    public Page<UserView> selectPage(Page<UserView> page,String type,String orderType) {
        return userViewMapper.selectPage(page,type,orderType);
    }
}
