package com.bb.standard.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bb.standard.bean.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author bb
 * @since 2019-09-01
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    IPage<User>  selectPage(Page page);

}
