package com.henry.uac.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.henry.uac.mapper.TenantMapper;
import com.henry.uac.model.po.Tenant;
import com.henry.uac.model.request.TenantInsertReq;
import org.springframework.stereotype.Service;

@Service
public class TenantService extends ServiceImpl<TenantMapper, Tenant> {

    public void insert(TenantInsertReq tenantInsertReq) {
        final Tenant tenant = Tenant.builder()
                .name(tenantInsertReq.getName())
                .build();
        this.save(tenant);
    }
}
