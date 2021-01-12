package cn.zpeace.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.zpeace.mall.common.util.PageUtils;
import cn.zpeace.mall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author zpeace
 * @email 1106124433@qq.com
 * @date 2021-01-12 14:56:28
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

