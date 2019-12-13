package com.example.demo.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.api.model.User;
import com.example.demo.api.service.UserService;
import com.example.demo.provider.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * 路径：com.example.demo.api.impl
 * 类名：
 * 功能：userService 实现
 * 备注：该Service注解是dubbo的注解，不是spring的。若使用xml配置方式暴露接口，则不需要该注解。
 * 创建人：wangling
 * 创建时间：2018/6/12 16:05
 * 修改人：
 * 修改备注：
 * 修改时间：
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findOneById(Map<String, Object> params) {
        System.out.println("==================Service=========id========================"+params);
        return userMapper.findOneById(params);
    }

}
