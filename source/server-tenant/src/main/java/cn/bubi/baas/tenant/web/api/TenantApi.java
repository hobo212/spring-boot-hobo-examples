package cn.bubi.baas.tenant.web.api;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.bubi.baas.tenant.service.TenantService;
import cn.bubi.baas.tenant.web.vo.TenantListVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
/**
 * api的接口path/api/模块/功能
 * @author hobo
 *
 */
@Api("租户接口")
@RestController
@RequestMapping("/api/tenant")
public class TenantApi {
    @Autowired
    TenantService tenantService; 
    
    @ApiOperation(value = "租户列表")
    @PostMapping("/list")
    public @ResponseBody TenantListVO list(){
        TenantListVO tenantListVO = new TenantListVO();
        tenantListVO.setResult(tenantService.list());
        return tenantListVO;
    }
    @ApiOperation(value = "租户分页列表")
    @PostMapping("/plist")
    public @ResponseBody TenantListVO pageList(@PageableDefault(value = 10, sort = { "id" }, direction = Sort.Direction.DESC) Pageable pageable){
        TenantListVO tenantListVO = new TenantListVO();
        tenantListVO.setResult(tenantService.list());
        return tenantListVO;
    }
    
    @ApiOperation(value = "错误测试")
    @RequestMapping("/error")
    public @ResponseBody TenantListVO error(){
        throw new RuntimeException("错误测试");
    }
}
