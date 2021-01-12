package cn.zpeace.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.zpeace.mall.common.util.PageUtils;
import cn.zpeace.mall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author zpeace
 * @email 1106124433@qq.com
 * @date 2021-01-12 14:56:28
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

