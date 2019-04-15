package com.house.houseweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("com.house")
@MapperScan("com.house.housebiz.mapper")
public class HouseWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseWebApplication.class, args);
    }

}
