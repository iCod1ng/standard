package com.bb.standard.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bb.standard.bean.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bb
 * @since 2019-09-01
 */
public interface IUserService extends IService<User> {

    IPage<User> selectUserPage(Page<User> page);
}
