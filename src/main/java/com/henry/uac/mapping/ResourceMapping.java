package com.henry.uac.mapping;

import com.henry.uac.model.po.Resource;
import com.henry.uac.model.request.ResourceInsertReq;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResourceMapping {
    Resource reqToPo(final ResourceInsertReq request);

}
