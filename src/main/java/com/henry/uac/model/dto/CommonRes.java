package com.henry.uac.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommonRes {
    private final static Integer SUCCESS_CODE = 200;
    private final static Integer FAILED_CODE = 500;

    private Integer code;
    private String msg;
    private Object data;

    public static CommonRes successRes() {
        return CommonRes.builder()
                .code(SUCCESS_CODE)
                .build();
    }
}
