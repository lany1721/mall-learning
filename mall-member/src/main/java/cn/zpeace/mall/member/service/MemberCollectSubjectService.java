package cn.zpeace.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.zpeace.mall.common.util.PageUtils;
import cn.zpeace.mall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author zpeace
 * @email 1106124433@qq.com
 * @date 2021-01-12 15:06:45
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

