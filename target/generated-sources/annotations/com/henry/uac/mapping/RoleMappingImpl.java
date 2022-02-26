package com.henry.uac.mapping;

import com.henry.uac.model.po.Role;
import com.henry.uac.model.request.RoleInsertReq;
import com.henry.uac.model.request.RoleUpdateReq;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-26T16:05:26+0800",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class RoleMappingImpl implements RoleMapping {

    @Override
    public Role reqToPo(RoleInsertReq request) {
        if ( request == null ) {
            return null;
        }

        Role role = new Role();

        role.setTenantId( request.getTenantId() );
        role.setName( request.getName() );
        role.setCode( request.getCode() );
        role.setDescription( request.getDescription() );

        return role;
    }

    @Override
    public void updatePo(Role role, RoleUpdateReq request) {
        if ( request == null ) {
            return;
        }

        role.setName( request.getName() );
        role.setCode( request.getCode() );
        role.setDescription( request.getDescription() );
    }
}
