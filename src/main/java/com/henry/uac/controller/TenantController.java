package com.henry.uac.controller;

import com.henry.uac.model.dto.CommonRes;
import com.henry.uac.model.request.TenantInsertReq;
import com.henry.uac.service.TenantService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(tags = "UAC租户")
@RestController
@RequestMapping("tenants")
@AllArgsConstructor
public class TenantController {
    private final TenantService tenantService;

    @ApiOperation(value = "新增UAC租户")
    @PostMapping()
    @ApiImplicitParam(name = "param", value = "数据新增请求参数")
    public CommonRes insert(@RequestBody @Valid final TenantInsertReq tenantInsertReq) {
        tenantService.insert(tenantInsertReq);
        return CommonRes.successRes();
    }
}
