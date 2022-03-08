package com.rockbb.pgdemo.commons;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.rockbb.pgdemo.commons.impl.mapper")
public class CommonsBoot {

    public static void main(String[] args) {
        SpringApplication.run(CommonsBoot.class, args);
    }

}