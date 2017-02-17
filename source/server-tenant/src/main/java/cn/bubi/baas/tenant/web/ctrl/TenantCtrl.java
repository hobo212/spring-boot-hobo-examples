package cn.bubi.baas.tenant.web.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.bubi.baas.tenant.service.TenantService;
/**
 * 租户控制类
 * @author hobo
 *
 */
@Controller
@RequestMapping(value = "/tenant")
public class TenantCtrl {
    @Autowired
    TenantService tenantService; 
    /**
     * 列出所有租户信息
     * TODO分页
     * @return
     */
    @PostMapping(value="/list", produces = "application/json; charset=utf-8")
    public String list(ModelMap model){
        model.put("list", tenantService.list());
        return "tenant/list";
    }
}
