package com.example.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.demo.api.model.Unions;
import com.example.demo.api.service.UnionService;
import com.example.demo.common.utils.Query;
import com.example.demo.common.utils.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author Created by wangling
 * @classname UnionController.java
 * @date 2020-01-02 14:51
 * @description ${description}
 */
@RestController
@RequestMapping("/union")
public class UnionController {
    @Reference
    UnionService unionService;

    @RequestMapping("/find")
    @ResponseBody
    public R findOneById(@RequestParam Map<String, Object> params){
        System.out.println("------Controller--------入参------"+params);

        List<Unions> unionList=unionService.findOneByName(params);

        //查询列表数据
        Query query = new Query(params);
        Page<Unions> pageUtil = new Page<Unions>(query.getPage(), query.getLimit());
        pageUtil.setRecords(unionList);
        return R.ok().put("page", pageUtil);
    }
}
