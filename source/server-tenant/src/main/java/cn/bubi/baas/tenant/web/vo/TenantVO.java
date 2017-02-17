package cn.bubi.baas.tenant.web.vo;
/**
 * 所有的pojo
 * @author hobo
 *
 */
public class TenantVO {
    public String address;
    public String pubKey;
    public String privKey;
    
    public TenantVO( String address, String pubKey, String privKey) {
        this.address = address;
        this.pubKey = pubKey;
        this.privKey = privKey;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPubKey() {
        return pubKey;
    }

    public void setPubKey(String pubKey) {
        this.pubKey = pubKey;
    }

    public String getPrivKey() {
        return privKey;
    }

    public void setPrivKey(String privKey) {
        this.privKey = privKey;
    }

}
