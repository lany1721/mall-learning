package cn.zpeace.mall.ware.controller;

import java.util.Arrays;
import java.util.Map;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.zpeace.mall.ware.entity.WareOrderTaskEntity;
import cn.zpeace.mall.ware.service.WareOrderTaskService;
import cn.zpeace.mall.common.util.PageUtils;
import cn.zpeace.mall.common.util.R;



/**
 * 库存工作单
 *
 * @author zpeace
 * @email 1106124433@qq.com
 * @date 2021-01-12 15:11:27
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/ware/wareordertask")
public class WareOrderTaskController {


    private final WareOrderTaskService wareOrderTaskService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wareOrderTaskService.queryPage(params);

        return R.ok().put("page", page);
    }

    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		WareOrderTaskEntity wareOrderTask = wareOrderTaskService.getById(id);

        return R.ok().put("wareOrderTask", wareOrderTask);
    }

    @RequestMapping("/save")
    public R save(@RequestBody WareOrderTaskEntity wareOrderTask){
		wareOrderTaskService.save(wareOrderTask);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody WareOrderTaskEntity wareOrderTask){
		wareOrderTaskService.updateById(wareOrderTask);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		wareOrderTaskService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
