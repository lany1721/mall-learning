package cn.zpeace.mall.order.dao;

import cn.zpeace.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zpeace
 * @email 1106124433@qq.com
 * @date 2021-01-12 15:10:01
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
