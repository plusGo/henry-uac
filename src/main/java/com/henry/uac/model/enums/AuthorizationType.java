package com.henry.uac.model.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AuthorizationType implements BaseDBEnum {
    CAN_ACCESS(0, "可访问"),
    CAN_AUTHORIZE(1, "可授予"),
    CAN_ACCESS_AUTHORIZE(2, "可访问可授予");

    static {
        subClass.add(AuthorizationType.class);
    }

    @EnumValue
    private final Integer value;
    @JsonValue
    private final String name;
}

