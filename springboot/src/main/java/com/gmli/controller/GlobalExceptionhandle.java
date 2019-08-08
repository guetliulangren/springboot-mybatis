package com.gmli.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author LGM
 * @date 2019/08/07
 */
@ControllerAdvice
public class GlobalExceptionhandle {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String, Object> handleException() {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("s", 100);
        map.put("erro", "系统出错");
        return map;

    }

}
