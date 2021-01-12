package cn.zpeace.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.zpeace.mall.common.util.PageUtils;
import cn.zpeace.mall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author zpeace
 * @email 1106124433@qq.com
 * @date 2021-01-12 11:06:24
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

