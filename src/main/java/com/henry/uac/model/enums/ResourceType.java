package com.henry.uac.model.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResourceType implements BaseDBEnum {
    PAGE(0, "页面"),
    POINT(1, "资源点"),
    API(2, "API接口");

    static {
        subClass.add(ResourceType.class);
    }

    @EnumValue
    private final Integer value;
    @JsonValue
    private final String name;
}

