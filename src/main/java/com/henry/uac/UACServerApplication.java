package com.henry.uac;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.henry.uac.mapper")
@NacosPropertySource(dataId = "henry-uac", autoRefreshed = true, groupId = "henry")
public class UACServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UACServerApplication.class, args);
    }
}
