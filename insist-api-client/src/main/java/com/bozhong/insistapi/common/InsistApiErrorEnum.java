package com.bozhong.insistapi.common;

import com.alibaba.fastjson.JSON;

/**
 * Created by xiezg@317hu.com on 2017/4/25 0025.
 */
public enum InsistApiErrorEnum {

    E10018("E10018", "Login Failure Public Private Key Expire", "用户密码公钥私钥加密策略过期，请重新进入登录页面！"),
    E10001("E10001", "Interface Definition Information Not Find, Please Call Relation Background Developer!",
            "未找到接口定义信息，请联系相关后台开发！"),
    E10002("E10002", "Interface Definition Information Has Found, But Not Find Return Example Data, " +
            "Please Call Relation Background Developer!",
            "接口定义信息已找到，但是未找到关联的返回示例数据, 请联系相关后台开发！"),
    E10003("E10003", "Search All App Information Error!", "查询全部应用信息出错!"),
    E10004("E10004", "AppId Can't Be Empty", "应用ID不能为空！"),
    E10005("E10005", "Can't Found Relation App", "未找到关联应用！"),
    E10006("E10006", "Can't Found App Interface Category，Interface Must Be Inner Interface Category！", "未找到应用接口类别，接口必须挂载在接口类别下！");


    private String error;

    private String msg;

    private String cnMsg;

    InsistApiErrorEnum(String error, String msg, String cnMsg) {
        this.error = error;
        this.msg = msg;
        this.cnMsg = cnMsg;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCnMsg() {
        return cnMsg;
    }

    public void setCnMsg(String cnMsg) {
        this.cnMsg = cnMsg;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
