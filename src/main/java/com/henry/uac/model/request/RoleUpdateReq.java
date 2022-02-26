package com.henry.uac.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.util.List;


@ApiModel(description = "修改角色请求")
@Data
public class RoleUpdateReq {
    @ApiModelProperty(name = "角色ID", required = true)
    @NotNull
    private Long roleId;

    @ApiModelProperty(name = "角色名称", required = true)
    @NotNull
    @Length(max = 255)
    private String name;

    @ApiModelProperty(name = "角色编码", required = true)
    @Length(max = 23)
    private String code;

    @ApiModelProperty(value = "描述")
    @Length(max = 1024)
    private String description;

    @ApiModelProperty(value = "资源ID数组")
    @NotNull
    private List<Long> resourceIds;
}
