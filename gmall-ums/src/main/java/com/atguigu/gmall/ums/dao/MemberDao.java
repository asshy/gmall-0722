package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yangdaoquan
 * @email 97394797@qq.com
 * @date 2020-04-14 17:11:15
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
