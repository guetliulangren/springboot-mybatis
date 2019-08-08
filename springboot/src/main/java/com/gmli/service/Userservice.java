package com.gmli.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author LGM
 * @date 2019/08/07
 */

@Service(value = "service")
public class Userservice {

    @Autowired
    JdbcTemplate template;

    public void insert(String name, String password) {

        template.update("insert into manager (name,password) values (?,?);", name, password);

    }

}
