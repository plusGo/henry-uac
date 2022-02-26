package com.henry.uac.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("uac_tenant")
@ApiModel(value = "UAC_Tenant", description = "UAC租户")
public class Tenant extends BaseEntity {
    @ApiModelProperty(value = "名称")
    @TableField("name")
    private String name;

}
