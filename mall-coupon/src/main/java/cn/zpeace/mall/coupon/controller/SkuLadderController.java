package cn.zpeace.mall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.zpeace.mall.coupon.entity.SkuLadderEntity;
import cn.zpeace.mall.coupon.service.SkuLadderService;
import cn.zpeace.mall.common.util.PageUtils;
import cn.zpeace.mall.common.util.R;



/**
 * 商品阶梯价格
 *
 * @author zpeace
 * @email 1106124433@qq.com
 * @date 2021-01-12 14:56:28
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/coupon/skuladder")
public class SkuLadderController {


    private final SkuLadderService skuLadderService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = skuLadderService.queryPage(params);

        return R.ok().put("page", page);
    }

    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SkuLadderEntity skuLadder = skuLadderService.getById(id);

        return R.ok().put("skuLadder", skuLadder);
    }

    @RequestMapping("/save")
    public R save(@RequestBody SkuLadderEntity skuLadder){
		skuLadderService.save(skuLadder);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody SkuLadderEntity skuLadder){
		skuLadderService.updateById(skuLadder);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		skuLadderService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
