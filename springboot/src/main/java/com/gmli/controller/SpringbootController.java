/*package com.gmli.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmli.dao.Userdao;
import com.gmli.entity.User;
import com.gmli.service.Userservice;

*//**
    * @author LGM
    * @date 2019/08/07
    *//*
      @EnableAutoConfiguration
      // 该接口返回Json格式的
      @RestController
      public class SpringbootController {
      
       @Resource(name = "service")
       Userservice userservice;
       @Autowired
       Userdao userdao;
      
       @RequestMapping("index")
       public String springboot() {
      
           return "springboot";
      
       }
      
       @RequestMapping("getmap")
       public Map<String, Object> result() {
      
           Map<String, Object> map = new HashMap<String, Object>();
           map.put("s", 100);
           map.put("erro", 200);
           return map;
      
       }
      
       @RequestMapping("insert")
       public String resultall(String name, String password) {
           userservice.insert(name, password);
           return "ok";
      
       }
      
       @RequestMapping("get")
       public User query(Integer id) {
      
           User user = null;
           user = userdao.findOne(id);
           return user;
      
       }
      
       @RequestMapping("getall")
       public List<User> queryall() {
      
           List<User> list = new ArrayList<User>();
      
           list = userdao.findAll();
           return list;
      
       }
      
       public static void main(String[] args) {
      
           SpringApplication.run(SpringbootController.class, args);
      
       }
      
      }*/
