package cn.bubi.baas.tenant.web.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.bubi.baas.tenant.web.vo.TenantListVO;
import cn.bubi.baas.tenant.web.vo.TenantVO;
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
    
    @ApiOperation(value = "租户列表")
    @PostMapping("/list")
    public @ResponseBody TenantListVO list(){
        TenantListVO tenantListVO = new TenantListVO();
        List<TenantVO> result = new ArrayList<>();
        result.add(new TenantVO("1","2","3"));
        tenantListVO.setResult(result);
        return tenantListVO;
    }
}
