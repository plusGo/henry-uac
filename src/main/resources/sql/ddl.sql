DROP TABLE IF EXISTS uac_tenant;
CREATE TABLE uac_tenant(
                          `id` bigint NOT NULL  COMMENT '主键' ,
                          `name` VARCHAR(255) NOT NULL   COMMENT '租户名称' ,
                          `version` INT    COMMENT '乐观锁' ,
                          `creator_id` BIGINT NOT NULL   COMMENT '创建人' ,
                          `created_time` DATETIME NOT NULL   COMMENT '创建时间' ,
                          `modifier_id` BIGINT    COMMENT '更新人' ,
                          `modified_time` DATETIME    COMMENT '更新时间' ,
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT = 'UAC租户';

DROP TABLE IF EXISTS uac_resource;
CREATE TABLE uac_resource(
                           `id` bigint NOT NULL  COMMENT '主键' ,
                           `name` VARCHAR(255) NOT NULL   COMMENT '名称' ,
                           `tenant_id` bigint NOT NULL   COMMENT '租户ID' ,
                           `code` VARCHAR(23)  NOT NULL  COMMENT '编码' ,
                           `type` tinyint  NOT NULL  COMMENT '类型' ,
                           `parent_resource_id` bigint  COMMENT '父资源ID' ,
                           `data` VARCHAR(1024) NOT NULL   COMMENT '数据' ,
                           `custom_ata` VARCHAR(1024) COMMENT '自定义数据' ,
                           `description` VARCHAR(1024) COMMENT '描述' ,
                           `version` INT    COMMENT '乐观锁' ,
                           `creator_id` BIGINT NOT NULL   COMMENT '创建人' ,
                           `created_time` DATETIME NOT NULL   COMMENT '创建时间' ,
                           `modifier_id` BIGINT    COMMENT '更新人' ,
                           `modified_time` DATETIME    COMMENT '更新时间' ,
                           PRIMARY KEY (`id`),
                           KEY `tenant_id` (`tenant_id`),
                           KEY `tenant_id-code` (`tenant_id`,`code`)
) ENGINE=InnoDB COMMENT = 'UAC资源';

DROP TABLE IF EXISTS uac_role;
CREATE TABLE uac_role(
                             `id` bigint NOT NULL  COMMENT '主键' ,
                             `name` VARCHAR(255) NOT NULL   COMMENT '名称' ,
                             `tenant_id` bigint NOT NULL   COMMENT '租户ID' ,
                             `code` VARCHAR(23)  COMMENT '编码' ,
                             `description` VARCHAR(1024) COMMENT '描述' ,
                             `version` INT    COMMENT '乐观锁' ,
                             `creator_id` BIGINT NOT NULL   COMMENT '创建人' ,
                             `created_time` DATETIME NOT NULL   COMMENT '创建时间' ,
                             `modifier_id` BIGINT    COMMENT '更新人' ,
                             `modified_time` DATETIME    COMMENT '更新时间' ,
                             PRIMARY KEY (`id`),
                             KEY `tenant_id` (`tenant_id`)
) ENGINE=InnoDB COMMENT = 'UAC角色';


DROP TABLE IF EXISTS uac_role_resource;
CREATE TABLE uac_role_resource(
                         `id` bigint NOT NULL  COMMENT '主键' ,
                         `role_id` bigint NOT NULL   COMMENT '角色ID' ,
                         `tenant_id` bigint NOT NULL   COMMENT '租户ID' ,
                         `resource_id` bigint NOT NULL   COMMENT '资源ID' ,
                         `version` INT    COMMENT '乐观锁' ,
                         `creator_id` BIGINT NOT NULL   COMMENT '创建人' ,
                         `created_time` DATETIME NOT NULL   COMMENT '创建时间' ,
                         `modifier_id` BIGINT    COMMENT '更新人' ,
                         `modified_time` DATETIME    COMMENT '更新时间' ,
                         PRIMARY KEY (`id`),
                         KEY `role_id` (`role_id`),
                         KEY `resource_id` (`resource_id`)
) ENGINE=InnoDB COMMENT = 'UAC角色资源关联表';

DROP TABLE IF EXISTS uac_authorization_record;
CREATE TABLE uac_authorization_record(
                                  `id` bigint NOT NULL  COMMENT '主键' ,
                                  `role_id` bigint NOT NULL   COMMENT '角色ID' ,
                                  `tenant_id` bigint NOT NULL   COMMENT '租户ID' ,
                                  `scopes` VARCHAR(1024)  COMMENT '范围' ,
                                  `target_id` bigint NOT NULL   COMMENT '用户OpenID' ,
                                  `target_type` tinyint  NOT NULL  COMMENT '授权目标类型' ,
                                  `type` tinyint  NOT NULL  COMMENT '授权类型' ,
                                  `version` INT    COMMENT '乐观锁' ,
                                  `creator_id` BIGINT NOT NULL   COMMENT '创建人' ,
                                  `created_time` DATETIME NOT NULL   COMMENT '创建时间' ,
                                  `modifier_id` BIGINT    COMMENT '更新人' ,
                                  `modified_time` DATETIME    COMMENT '更新时间' ,
                                  PRIMARY KEY (`id`),
                                  KEY `role_id` (`role_id`),
                                  KEY `tenant_id` (`tenant_id`)
) ENGINE=InnoDB COMMENT = 'UAC授权记录表';

