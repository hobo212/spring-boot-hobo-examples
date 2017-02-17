package cn.bubi.baas.tenant.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/**
 * sdk调用baasapi所需要的参数
 * @author hobo
 *
 */
@Component
@ConfigurationProperties("baasapi")
public class BaasApiConf {
    private String address;
    private int port;
    private Boolean https;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Boolean getHttps() {
        return https;
    }

    public void setHttps(Boolean https) {
        this.https = https;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    
}
