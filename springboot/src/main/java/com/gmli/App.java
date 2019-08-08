package com.gmli;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LGM
 * @date 2019/08/07
 */

@SpringBootApplication
@MapperScan(basePackages = {"com.gmli.dao"})

public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(App.class, args);
    }

}
