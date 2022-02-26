package com.henry.uac.mapping;

import com.henry.uac.model.po.Resource;
import com.henry.uac.model.request.ResourceInsertReq;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-26T16:05:26+0800",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class ResourceMappingImpl implements ResourceMapping {

    @Override
    public Resource reqToPo(ResourceInsertReq request) {
        if ( request == null ) {
            return null;
        }

        Resource resource = new Resource();

        resource.setTenantId( request.getTenantId() );
        resource.setName( request.getName() );
        resource.setCode( request.getCode() );
        resource.setType( request.getType() );
        resource.setParentResourceId( request.getParentResourceId() );
        resource.setData( request.getData() );
        resource.setCustomData( request.getCustomData() );
        resource.setDescription( request.getDescription() );

        return resource;
    }
}
