package cn.zpeace.mall.coupon.dao;

import cn.zpeace.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zpeace
 * @email 1106124433@qq.com
 * @date 2021-01-12 14:56:28
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
