package com.henry.uac.model.request;

import com.henry.uac.model.enums.ResourceType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;


@ApiModel(description = "创建资源请求")
@Data
public class ResourceInsertReq {
    @ApiModelProperty(name = "租户ID", required = true)
    @NotNull
    private Long tenantId;

    @ApiModelProperty(name = "资源名称", required = true)
    @NotNull
    @Length(max = 255)
    private String name;

    @ApiModelProperty(name = "资源编码", required = true)
    @NotNull
    @Length(max = 23)
    private String code;

    @ApiModelProperty(value = "类型", required = true)
    @NotNull
    private ResourceType type;

    @ApiModelProperty(value = "父资源ID")
    private Long parentResourceId;

    @ApiModelProperty(value = "数据", required = true)
    @NotNull
    @Length(max = 1024)
    private String data;

    @ApiModelProperty(value = "自定义数据")
    @Length(max = 1024)
    private String customData;

    @ApiModelProperty(value = "描述")
    @Length(max = 1024)
    private String description;
}
