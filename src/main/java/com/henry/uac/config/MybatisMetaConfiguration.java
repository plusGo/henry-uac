package com.henry.uac.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class MybatisMetaConfiguration implements MetaObjectHandler {
    Long userId = 1L;

    @Override
    public void insertFill(final MetaObject metaObject) {
        this.setFieldValByName("createdTime", LocalDateTime.now(), metaObject);
        this.setFieldValByName("modifiedTime", LocalDateTime.now(), metaObject);
        this.setFieldValByName("creatorId", userId, metaObject);
        this.setFieldValByName("modifierId", userId, metaObject);
    }

    @Override
    public void updateFill(final MetaObject metaObject) {
        this.setFieldValByName("modifier", userId, metaObject);
        this.setFieldValByName("modifiedTime", LocalDateTime.now(), metaObject);
    }
}
