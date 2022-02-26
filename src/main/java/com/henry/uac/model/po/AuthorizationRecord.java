package com.henry.uac.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.henry.uac.model.enums.AuthorizationTargetType;
import com.henry.uac.model.enums.AuthorizationType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName("uac_authorization_record")
@ApiModel(value = "UAC_authorization_record", description = "UAC授权记录表")
public class AuthorizationRecord extends BaseEntity {
    @ApiModelProperty(value = "角色ID")
    @TableField("role_id")
    private Long roleId;

    @ApiModelProperty(value = "目标ID")
    @TableField("target_id")
    private Long targetId;

    @ApiModelProperty(value = "授权目标类型")
    @TableField("target_type")
    private AuthorizationTargetType targetType;

    @ApiModelProperty(value = "授权类型")
    @TableField("type")
    private AuthorizationType type;

    @ApiModelProperty(value = "租户ID")
    @TableField("tenant_id")
    private Long tenantId;

    @ApiModelProperty(value = "范围")
    @TableField("scopes")
    private String scopes;
}
