package cn.zpeace.mall.product.dao;

import cn.zpeace.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zpeace
 * @email 1106124433@qq.com
 * @date 2021-01-12 11:06:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
