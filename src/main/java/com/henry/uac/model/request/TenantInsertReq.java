package com.henry.uac.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@ApiModel(description = "创建租户请求")
@Data
public class TenantInsertReq {
    @ApiModelProperty(name = "租户名称", required = true)
    @NotNull
    @Length(max = 255)
    private String name;

}
