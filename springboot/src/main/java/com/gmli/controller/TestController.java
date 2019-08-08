package com.gmli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmli.dao.UserMapper;
import com.gmli.entity.User;

/**
 * @author LGM
 * @date 2019/08/08
 */

@RestController
public class TestController {

    @Autowired
    private UserMapper mapper;

    @RequestMapping("getbyid")
    public User findbyid(String id) {

        return mapper.findbyid(id);

    }

}
