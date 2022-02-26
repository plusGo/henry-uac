package com.henry.uac.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.henry.uac.model.enums.ResourceType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName("uac_resource")
@ApiModel(value = "UAC_Resource", description = "UAC资源")
public class Resource extends BaseEntity {
    @ApiModelProperty(value = "租户ID")
    @TableField("tenant_id")
    private Long tenantId;

    @ApiModelProperty(value = "名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "编码")
    @TableField("code")
    private String code;

    @ApiModelProperty(value = "类型")
    @TableField("type")
    private ResourceType type;

    @ApiModelProperty(value = "父资源ID")
    @TableField("parent_resource_id")
    private Long parentResourceId;

    @ApiModelProperty(value = "数据")
    @TableField("data")
    private String data;

    @ApiModelProperty(value = "自定义数据")
    @TableField("custom_data")
    private String customData;

    @ApiModelProperty(value = "描述")
    @TableField("description")
    private String description;
}
