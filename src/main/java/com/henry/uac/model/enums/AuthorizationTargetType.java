package com.henry.uac.model.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AuthorizationTargetType implements BaseDBEnum {
    USER(0, "用户"),
    ORG(1, "机构"),
    GROUP(2, "群组");

    static {
        subClass.add(AuthorizationTargetType.class);
    }

    @EnumValue
    private final Integer value;
    @JsonValue
    private final String name;
}

