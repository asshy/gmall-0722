package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yangdaoquan
 * @email 97394797@qq.com
 * @date 2020-04-14 16:56:48
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
