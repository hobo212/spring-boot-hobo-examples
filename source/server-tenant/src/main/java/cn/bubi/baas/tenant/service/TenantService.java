package cn.bubi.baas.tenant.service;

import java.util.List;

import cn.bubi.baas.tenant.web.vo.TenantVO;
/**
 * 租户服务
 * @author hobo
 *
 */
public interface TenantService {
    /**
     * 列出所有租户
     * @return
     */
    List<TenantVO> list();

}
