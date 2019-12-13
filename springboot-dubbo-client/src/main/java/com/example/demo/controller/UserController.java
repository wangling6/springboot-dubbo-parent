package com.example.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.demo.api.model.User;
import com.example.demo.api.service.UserService;
import com.example.demo.common.utils.Query;
import com.example.demo.common.utils.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * 路径：com.example.demo.controller
 * 类名：
 * 功能：《用一句话描述一下》
 * 备注：
 * 创建人：wangling
 * 创建时间：2018/6/15 16:15
 * 修改人：
 * 修改备注：
 * 修改时间：
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 注入服务提供方暴露的接口，通过@Reference注解，dubbo会在扫描的时候自动代理接口，然后通过rpc调用远程服务。
     * 如果用xml配置方式，需要将@Reference换成@Autowired。
     */
    @Reference
    UserService userService;

    @RequestMapping("/find")
    @ResponseBody
    public R findOneById(@RequestParam Map<String, Object> params){
        System.out.println("------Controller--------id------"+params);

        List<User> userList=userService.findOneById(params);

        //查询列表数据
        Query query = new Query(params);
        Page<User> pageUtil = new Page<User>(query.getPage(), query.getLimit());
        pageUtil.setRecords(userList);
        return R.ok().put("page", pageUtil);
    }

}