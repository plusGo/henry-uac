package com.henry.uac.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


@ApiModel(description = "修改用户角色授权请求")
@Data
public class UpdateUserAuthorizeReq {
    @ApiModelProperty(name = "授权记录ID", required = true)
    @NotNull
    private Long userAuhotiz;

    @ApiModelProperty(name = "租户ID", required = true)
    @NotNull
    private Long tenantId;

    @ApiModelProperty(name = "用户OpenID", required = true)
    @NotNull
    private Long openId;

    @ApiModelProperty(name = "角色ID", required = true)
    @NotNull
    private Long roleId;

    @ApiModelProperty(name = "范围", required = true)
    private String scopes;

}
