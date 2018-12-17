package com.zty.springmapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.zty.springmapper.mapper")
public class SpringMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMapperApplication.class, args);
    }

}

