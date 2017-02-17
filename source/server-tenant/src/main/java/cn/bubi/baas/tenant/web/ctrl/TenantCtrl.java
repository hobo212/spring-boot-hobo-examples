package cn.bubi.baas.tenant.web.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
    @GetMapping
    public ModelAndView list() {
        return new ModelAndView("tenant/list", "tenant", tenantService.list());
    }
}
