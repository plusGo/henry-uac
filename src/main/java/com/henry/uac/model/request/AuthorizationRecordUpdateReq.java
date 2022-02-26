package com.henry.uac.model.request;

import com.henry.uac.model.enums.AuthorizationType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


@ApiModel(description = "新增用户角色授权请求")
@Data
public class AuthorizationRecordUpdateReq {

    @ApiModelProperty(name = "授权记录ID", required = true)
    @NotNull
    private Long authorizationRecordId;

    @ApiModelProperty(value = "授权类型", required = true)
    @NotNull
    private AuthorizationType type;

    @ApiModelProperty(name = "范围", required = true)
    private String scopes;

}
