package com.gmli.dao;

import org.apache.ibatis.annotations.Select;

import com.gmli.entity.User;

/**
 * @author LGM
 * @date 2019/08/08
 */
public interface UserMapper {

    @Select("select * from manager where id=#{id}")
    User findbyid(String id);

}
