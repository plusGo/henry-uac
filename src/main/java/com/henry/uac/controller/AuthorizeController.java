package com.henry.uac.controller;

import com.henry.uac.model.dto.CommonRes;
import com.henry.uac.model.request.AuthorizationRecordUpdateReq;
import com.henry.uac.model.request.AuthorizationRecordInsertReq;
import com.henry.uac.service.AuthorizeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(tags = "UAC授权")
@RestController
@RequestMapping("authorize")
@AllArgsConstructor
public class AuthorizeController {
    private final AuthorizeService authorizeService;

    @ApiOperation(value = "新增用户角色授权记录")
    @PostMapping()
    @ApiImplicitParam(name = "param", value = "数据新增请求参数")
    public CommonRes authorize(@RequestBody @Valid final AuthorizationRecordInsertReq insertReq) {
        authorizeService.authorize(insertReq);
        return CommonRes.successRes();
    }

    @ApiOperation(value = "修改用户角色授权记录")
    @PutMapping()
    @ApiImplicitParam(name = "param", value = "数据修改请求参数")
    public CommonRes updateAuthorizationRecord(@RequestBody @Valid final AuthorizationRecordUpdateReq updateReq) {
        authorizeService.updateAuthorizationRecord(updateReq);
        return CommonRes.successRes();
    }
}
