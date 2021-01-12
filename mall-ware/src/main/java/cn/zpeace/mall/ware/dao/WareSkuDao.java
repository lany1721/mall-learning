package cn.zpeace.mall.ware.dao;

import cn.zpeace.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author zpeace
 * @email 1106124433@qq.com
 * @date 2021-01-12 15:11:27
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
