package com.henry.uac.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.henry.uac.mapper.RoleMapper;
import com.henry.uac.mapping.RoleMapping;
import com.henry.uac.model.po.Role;
import com.henry.uac.model.request.RoleInsertReq;
import com.henry.uac.model.request.RoleUpdateReq;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class RoleService extends ServiceImpl<RoleMapper, Role> {
    private final RoleResourceService roleResourceService;
    private final RoleMapping roleMapping;

    @Transactional(rollbackFor = Exception.class)
    public void insert(final RoleInsertReq roleInsertReq) {
        final Role role = roleMapping.reqToPo(roleInsertReq);
        this.save(role);
        final Long roleId = role.getId();
        roleResourceService.link(roleId, roleInsertReq.getResourceIds());
    }

    @Transactional(rollbackFor = Exception.class)
    public void update(final RoleUpdateReq roleUpdateReq) {
        final Long roleId = roleUpdateReq.getRoleId();

        final Role dbRole = this.getById(roleId);
        roleMapping.updatePo(dbRole, roleUpdateReq);
        this.updateById(dbRole);

        this.roleResourceService.clean(roleId);
        roleResourceService.link(roleId, roleUpdateReq.getResourceIds());
    }
}
