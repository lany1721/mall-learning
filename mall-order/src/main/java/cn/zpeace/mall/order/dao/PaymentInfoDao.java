package cn.zpeace.mall.order.dao;

import cn.zpeace.mall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author zpeace
 * @email 1106124433@qq.com
 * @date 2021-01-12 15:10:01
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
