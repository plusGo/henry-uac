package com.henry.uac.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.henry.uac.mapper.ResourceMapper;
import com.henry.uac.mapping.ResourceMapping;
import com.henry.uac.model.po.Resource;
import com.henry.uac.model.request.ResourceInsertReq;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ResourceService extends ServiceImpl<ResourceMapper, Resource> {
    private final ResourceMapping resourceMapping;

    public void insert(final ResourceInsertReq resourceInsertReq) {
        final Resource resource = resourceMapping.reqToPo(resourceInsertReq);
        this.save(resource);
    }


}
