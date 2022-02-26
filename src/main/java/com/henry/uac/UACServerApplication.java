package com.henry.uac;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.henry.uac.mapper")
public class UACServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UACServerApplication.class, args);
    }
}
