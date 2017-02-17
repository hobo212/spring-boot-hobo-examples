package cn.bubi.baas.tenant.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeCtrl {
    @RequestMapping("/")
    String hello(){
        return "welcome to baas tenant manage system";
    }

}
