package com.henry.uac.controller;

import com.henry.uac.model.dto.CommonRes;
import com.henry.uac.model.request.ResourceInsertReq;
import com.henry.uac.service.ResourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(tags = "UAC资源")
@RestController
@RequestMapping("resources")
@AllArgsConstructor
public class ResourceController {
    private final ResourceService resourceService;

    @ApiOperation(value = "新增UAC资源")
    @PostMapping()
    @ApiImplicitParam(name = "param", value = "数据新增请求参数")
    public CommonRes insert(@RequestBody @Valid final ResourceInsertReq resourceInsertReq) {
        resourceService.insert(resourceInsertReq);
        return CommonRes.successRes();
    }
}
