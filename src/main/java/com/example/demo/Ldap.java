package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangkai
 */
@Configuration
@ConfigurationProperties(prefix = "ldap")
public class Ldap {

    /**
     * ldap服务地址
     */
    private String url;

    /**
     * ROOT根据此参数确认用户组织所在位置
     */
    private String principal;

    /**
     * LDAP驱动
     */
    private String factory;

    /**
     * 域名
     */
    private String domaincomponent;

    /**
     * 管理员密码
     */
    private String password;

    /**
     * 是否开启openlpad
     */
    private Boolean isopen;

    public Boolean getIsopen() {
        return isopen;
    }

    public void setIsopen(Boolean isopen) {
        this.isopen = isopen;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getDomaincomponent() {
        return domaincomponent;
    }

    public void setDomaincomponent(String domaincomponent) {
        this.domaincomponent = domaincomponent;
    }

    @Override
    public String toString() {
        return "Ldap{" +
                "url='" + url + '\'' +
                ", principal='" + principal + '\'' +
                ", factory='" + factory + '\'' +
                ", domaincomponent='" + domaincomponent + '\'' +
                ", password='" + password + '\'' +
                ", isopen=" + isopen +
                '}';
    }
}
