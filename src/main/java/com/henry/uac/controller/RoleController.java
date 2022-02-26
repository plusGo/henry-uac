package com.henry.uac.controller;

import com.henry.uac.model.dto.CommonRes;
import com.henry.uac.model.request.RoleInsertReq;
import com.henry.uac.model.request.RoleUpdateReq;
import com.henry.uac.service.RoleService;
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

@Api(tags = "UAC角色")
@RestController
@RequestMapping("roles")
@AllArgsConstructor
public class RoleController {
    private final RoleService roleService;

    @ApiOperation(value = "新增UAC角色")
    @PostMapping()
    @ApiImplicitParam(name = "param", value = "数据新增请求参数")
    public CommonRes insert(@RequestBody @Valid final RoleInsertReq roleInsertReq) {
        roleService.insert(roleInsertReq);
        return CommonRes.successRes();
    }

    @ApiOperation(value = "修改UAC角色")
    @PutMapping()
    @ApiImplicitParam(name = "param", value = "数据修改请求参数")
    public CommonRes update(@RequestBody @Valid final RoleUpdateReq roleUpdateReq) {
        roleService.update(roleUpdateReq);
        return CommonRes.successRes();
    }
}
