package com.example.demo.provider.dao;


import com.example.demo.api.model.User;

import java.util.List;
import java.util.Map;

/**
 * 路径：com.example.demo.dao
 * 类名：
 * 功能：《用一句话描述一下》
 * 备注：
 * 创建人：wangling
 * 创建时间：2018/6/15 16:15
 * 修改人：
 * 修改备注：
 * 修改时间：
 */
public interface UserMapper {

    List<User> findOneById(Map<String, Object> params);
}
