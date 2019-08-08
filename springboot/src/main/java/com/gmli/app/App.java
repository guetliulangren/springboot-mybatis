package com.gmli.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author LGM
 * @date 2019/08/07
 */

/*@SpringBootApplication*/
@ComponentScan(basePackages = {"com.gmli.controller", "com.gmli.service"})
@MapperScan(basePackages = {"com.gmli.dao"})
@EnableAutoConfiguration
public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(App.class, args);
    }

}
