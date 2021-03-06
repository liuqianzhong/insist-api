package com.bozhong.insistapi.entity;


import java.io.Serializable;

/**
 * Created by renyueliang on 16/12/29.
 */
public class AppDO implements Serializable {

    private String appId;
    private String appName;
    private boolean mainSelectType = false;//应用管理选中状态
    private boolean viewSelectType = false;//应用预览选中状态
    private boolean hasAuth = false;//是否有写权限

    /**
     * 应用接口类别总个数
     */
    private Integer categoryCount;

    /**
     * 应用接口总个数
     */
    private Integer interfaceCount;


    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }


    public boolean isMainSelectType() {
        return mainSelectType;
    }

    public void setMainSelectType(boolean mainSelectType) {
        this.mainSelectType = mainSelectType;
    }

    public boolean isViewSelectType() {
        return viewSelectType;
    }

    public void setViewSelectType(boolean viewSelectType) {
        this.viewSelectType = viewSelectType;
    }

    public Integer getCategoryCount() {
        return categoryCount;
    }

    public void setCategoryCount(Integer categoryCount) {
        if (categoryCount == null) {
            this.categoryCount = 0;
        } else {
            this.categoryCount = categoryCount;
        }
    }

    public Integer getInterfaceCount() {
        return interfaceCount;
    }

    public void setInterfaceCount(Integer interfaceCount) {
        if (interfaceCount == null) {
            this.interfaceCount = 0;
        } else {
            this.interfaceCount = interfaceCount;
        }
    }

    public void setInterfaceCount(Integer interfaceCount, Integer interfaceCount2) {
        if (interfaceCount == null) {
            interfaceCount = 0;
        }

        if (interfaceCount2 == null) {
            interfaceCount2 = 0;
        }

        this.interfaceCount = interfaceCount + interfaceCount2;
    }

    public boolean isHasAuth() {
        return hasAuth;
    }

    public void setHasAuth(boolean hasAuth) {
        this.hasAuth = hasAuth;
    }
}
