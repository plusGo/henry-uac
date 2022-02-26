package com.henry.uac.model.enums;


import com.google.common.collect.Sets;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public interface BaseDBEnum {
    /**
     * 存放已有的枚举类型，在config中进行注册
     */
    Set<Class<?>> subClass = Sets.newConcurrentHashSet();

    /**
     * 用于显示的枚举名称
     */
    String getName();

    /**
     * 存储到数据库的枚举值
     */
    Integer getValue();

    /**
     * 按照枚举的value获取枚举实例
     */
    static <T extends BaseDBEnum> T fromValue(final Class<T> enumType, final Integer value) {
        return Stream.of(enumType.getEnumConstants())
                .filter(enumConstant -> Objects.equals(enumConstant.getValue(), value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No enum value" + value + "of" + enumType.getCanonicalName()));
    }

    /**
     * 根据英文名称和泛型获取枚举
     */
    static <T extends BaseDBEnum> Optional<T> fromTrueName(final Class<T> enumType, final String trueName) {
        return Stream.of(enumType.getEnumConstants())
                .filter(enumConstant -> Objects.equals(enumConstant.getName(), trueName))
                .findFirst();
    }
}
