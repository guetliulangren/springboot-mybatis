package com.gmli.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LGM
 * @date 2019/08/07
 */

@Controller
public class ViewController {

    @RequestMapping("view")
    public String springbootview(Map<String, Object> result) {

        result.put("name", "李桂铭");

        System.out.println("hello");
        return "index";

    }
}
