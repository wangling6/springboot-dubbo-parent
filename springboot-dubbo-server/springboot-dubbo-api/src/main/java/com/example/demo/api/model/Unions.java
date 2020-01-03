package com.example.demo.api.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 路径：com.example.demo.api.model
 * 类名：
 * 功能：《用一句话描述一下》
 * 备注：
 * 创建人：wangling
 * 创建时间：2018/6/12 15:55
 * 修改人：
 * 修改备注：
 * 修改时间：
 */
public class Unions implements Serializable {
    private Integer id;
    private String union_name;
    private String union_ename;
    private String group_names;
    private String union_desc;
    private String unionstatus;
    private String create_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnion_name() {
        return union_name;
    }

    public void setUnion_name(String union_name) {
        this.union_name = union_name;
    }

    public String getUnion_ename() {
        return union_ename;
    }

    public void setUnion_ename(String union_ename) {
        this.union_ename = union_ename;
    }

    public String getGroup_names() {
        return group_names;
    }

    public void setGroup_names(String group_names) {
        this.group_names = group_names;
    }

    public String getUnion_desc() {
        return union_desc;
    }

    public void setUnion_desc(String union_desc) {
        this.union_desc = union_desc;
    }

    public String getUnionstatus() {
        return unionstatus;
    }

    public void setUnionstatus(String unionstatus) {
        this.unionstatus = unionstatus;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }
}
