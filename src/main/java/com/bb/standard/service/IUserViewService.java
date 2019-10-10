package com.bb.standard.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bb.standard.bean.entity.UserView;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * VIEW 服务类
 * </p>
 *
 * @author bb
 * @since 2019-09-01
 */
public interface IUserViewService extends IService<UserView> {

    Page<UserView> selectPage(Page<UserView> page,String type,String orderType);

}
