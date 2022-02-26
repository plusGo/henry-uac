package com.henry.uac.mapping;

import com.henry.uac.model.po.Role;
import com.henry.uac.model.request.RoleInsertReq;
import com.henry.uac.model.request.RoleUpdateReq;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface RoleMapping {
    Role reqToPo(final RoleInsertReq request);

    void updatePo(@MappingTarget final Role role, final RoleUpdateReq request);

}
