package cn.bubi.baas.tenant.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bubi.baas.tenant.conf.BaasApiConf;
import cn.bubi.baas.tenant.service.TenantService;
import cn.bubi.baas.tenant.web.vo.TenantVO;

@Service
public class TenantServiceImpl implements TenantService{
    @Autowired
    BaasApiConf conf;
    @Override
    public List<TenantVO> list() {
        System.out.println(conf.getAddress());
        List<TenantVO> result = new ArrayList<>();
        result.add(new TenantVO("1","2","3"));
        return result;
    }

}
