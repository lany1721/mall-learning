package cn.zpeace.mall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.zpeace.mall.coupon.entity.SeckillSkuRelationEntity;
import cn.zpeace.mall.coupon.service.SeckillSkuRelationService;
import cn.zpeace.mall.common.util.PageUtils;
import cn.zpeace.mall.common.util.R;



/**
 * 秒杀活动商品关联
 *
 * @author zpeace
 * @email 1106124433@qq.com
 * @date 2021-01-12 14:56:28
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/coupon/seckillskurelation")
public class SeckillSkuRelationController {


    private final SeckillSkuRelationService seckillSkuRelationService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = seckillSkuRelationService.queryPage(params);

        return R.ok().put("page", page);
    }

    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SeckillSkuRelationEntity seckillSkuRelation = seckillSkuRelationService.getById(id);

        return R.ok().put("seckillSkuRelation", seckillSkuRelation);
    }

    @RequestMapping("/save")
    public R save(@RequestBody SeckillSkuRelationEntity seckillSkuRelation){
		seckillSkuRelationService.save(seckillSkuRelation);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody SeckillSkuRelationEntity seckillSkuRelation){
		seckillSkuRelationService.updateById(seckillSkuRelation);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		seckillSkuRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
