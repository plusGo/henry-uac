package com.henry.uac.service;

import com.henry.uac.mapping.AuthorizationRecordMapping;
import com.henry.uac.model.po.AuthorizationRecord;
import com.henry.uac.model.request.AuthorizationRecordInsertReq;
import com.henry.uac.model.request.AuthorizationRecordUpdateReq;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorizeService {
    private final AuthorizationRecordService authorizationRecordService;
    private final AuthorizationRecordMapping authorizationRecordMapping;

    public void authorize(final AuthorizationRecordInsertReq roleInsertReq) {
        final AuthorizationRecord authorizationRecord = authorizationRecordMapping.reqToPo(roleInsertReq);
        authorizationRecordService.save(authorizationRecord);
    }

    public void updateAuthorizationRecord(final AuthorizationRecordUpdateReq updateReq) {
        final AuthorizationRecord dbRecord = authorizationRecordService.getById(updateReq.getAuthorizationRecordId());
        authorizationRecordMapping.updatePo(dbRecord, updateReq);
        authorizationRecordService.updateById(dbRecord);

    }
}
