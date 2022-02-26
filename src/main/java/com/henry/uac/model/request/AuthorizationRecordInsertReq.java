package com.henry.uac.model.request;

import com.henry.uac.model.enums.AuthorizationTargetType;
import com.henry.uac.model.enums.AuthorizationType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


@ApiModel(description = "新增用户角色授权请求")
@Data
public class AuthorizationRecordInsertReq {

    @ApiModelProperty(name = "角色ID", required = true)
    @NotNull
    private Long roleId;

    @ApiModelProperty(name = "租户ID", required = true)
    @NotNull
    private Long tenantId;

    @ApiModelProperty(name = "目标ID", required = true)
    @NotNull
    private Long targetId;

    @ApiModelProperty(value = "授权目标类型", required = true)
    @NotNull
    private AuthorizationTargetType targetType;

    @ApiModelProperty(value = "授权类型", required = true)
    @NotNull
    private AuthorizationType type;


    @ApiModelProperty(name = "范围", required = true)
    private String scopes;

}
