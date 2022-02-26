package com.henry.uac.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.ImmutableMap;
import com.henry.uac.mapper.AuthorizationRecordMapper;
import com.henry.uac.model.po.AuthorizationRecord;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorizationRecordService extends ServiceImpl<AuthorizationRecordMapper, AuthorizationRecord> {

    public void clean(final Long openId) {
        this.removeByMap(ImmutableMap.of("open_id", openId));
    }
}
