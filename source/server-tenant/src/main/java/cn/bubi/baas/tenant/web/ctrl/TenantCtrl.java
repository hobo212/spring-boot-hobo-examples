package cn.bubi.baas.tenant.web.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.bubi.baas.tenant.service.TenantService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
/**
 * 租户控制类
 * @author hobo
 *
 */
import springfox.documentation.swagger2.configuration.Swagger2DocumentationConfiguration;
@Api("租户接口")
@Controller
@RequestMapping(value = "/api/tenant")
public class TenantCtrl {
    @Autowired
    Swagger2DocumentationConfiguration Swagger2DocumentationConfiguration;
    @Autowired
    TenantService tenantService; 
    /**
     * 列出所有租户信息
     * TODO分页
     * @return
     */
    @ApiOperation(value = "租户列表")
    @PostMapping(value="/list", produces = "application/json; charset=utf-8")
    public String list(ModelMap model){
        model.put("list", tenantService.list());
        return "tenant/list";
    }
}
