package cn.zpeace.mall.member.dao;

import cn.zpeace.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zpeace
 * @email 1106124433@qq.com
 * @date 2021-01-12 15:06:45
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
