package com.henry.uac.mapping;

import com.henry.uac.model.po.AuthorizationRecord;
import com.henry.uac.model.request.AuthorizationRecordInsertReq;
import com.henry.uac.model.request.AuthorizationRecordUpdateReq;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface AuthorizationRecordMapping {
    void updatePo(@MappingTarget final AuthorizationRecord record, final AuthorizationRecordUpdateReq request);

    AuthorizationRecord reqToPo(final AuthorizationRecordInsertReq request);

}
