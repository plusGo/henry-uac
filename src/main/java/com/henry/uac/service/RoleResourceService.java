package com.henry.uac.service;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.ImmutableMap;
import com.henry.uac.mapper.RoleResourceMapper;
import com.henry.uac.model.po.RoleResource;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RoleResourceService extends ServiceImpl<RoleResourceMapper, RoleResource> {

    public void link(final Long roleId, final List<Long> resourceIds) {
        if (CollectionUtil.removeNull(resourceIds).isEmpty()) {
            return;
        }
        final List<RoleResource> relations = resourceIds.stream()
                .map(resourceId -> RoleResource.builder()
                        .roleId(roleId)
                        .resourceId(resourceId)
                        .build()
                )
                .collect(Collectors.toList());
        this.saveBatch(relations);
    }

    public void clean(final Long roleId) {
        this.removeByMap(ImmutableMap.of("role_id", roleId));
    }
}
