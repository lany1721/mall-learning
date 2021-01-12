package cn.zpeace.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.zpeace.mall.product.entity.SpuCommentEntity;
import cn.zpeace.mall.product.service.SpuCommentService;
import cn.zpeace.mall.common.util.PageUtils;
import cn.zpeace.mall.common.util.R;



/**
 * 商品评价
 *
 * @author zpeace
 * @email 1106124433@qq.com
 * @date 2021-01-12 11:06:24
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/product/spucomment")
public class SpuCommentController {


    private final SpuCommentService spuCommentService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = spuCommentService.queryPage(params);

        return R.ok().put("page", page);
    }

    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SpuCommentEntity spuComment = spuCommentService.getById(id);

        return R.ok().put("spuComment", spuComment);
    }

    @RequestMapping("/save")
    public R save(@RequestBody SpuCommentEntity spuComment){
		spuCommentService.save(spuComment);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody SpuCommentEntity spuComment){
		spuCommentService.updateById(spuComment);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		spuCommentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
