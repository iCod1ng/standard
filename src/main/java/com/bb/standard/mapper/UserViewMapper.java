package com.bb.standard.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bb.standard.bean.entity.UserView;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * VIEW Mapper 接口
 * </p>
 *
 * @author bb
 * @since 2019-09-01
 */
@Repository
public interface UserViewMapper extends BaseMapper<UserView> {

    Page<UserView> selectPage(Page page, @Param("order") String order, @Param("orderType") String orderType);

}
