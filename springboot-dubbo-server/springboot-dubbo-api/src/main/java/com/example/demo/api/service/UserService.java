package com.example.demo.api.service;


import com.example.demo.api.model.User;

import java.util.List;
import java.util.Map;

/**
 * 路径：com.example.demo.api.service
 * 类名：
 * 功能：用户Service
 * 备注：
 * 创建人：wangling
 * 创建时间：2018/6/12 15:54
 * 修改人：
 * 修改备注：
 * 修改时间：
 */
public interface UserService {


    List<User> findOneById(Map<String, Object> params);

}
