//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.trs.dto;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.Serializable;
import java.util.Map;

public class Result<T> implements Serializable {
    private static final long serialVersionUID = -4569216979022946969L;

    private T data;

    private boolean isSuccess = false;

    private String resultMsg = "执行失败!";

    public Result() {
    }

    public static Result fail() {
        return new Result();
    }

    public static Result fail(String msg) {
        Result result = fail();
        result.setResultMsg(msg);
        return result;
    }

    public static Result success(String msg) {
        Result result = success();
        result.setResultMsg(msg);
        return result;
    }

    public static Result success() {
        return success(new Result());
    }

    public static Result success(Result result) {
        if (result == null) {
            result = new Result();
        }

        result.setResultMsg("执行成功！");
        result.setIsSuccess(true);
        return result;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getResultMsg() {
        return this.resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public String toString() {
        return JSON.toJSONString(this, new SerializerFeature[]{SerializerFeature.DisableCircularReferenceDetect});
    }

    public Result removeData(String... keys) {
        if (this.data != null && this.data instanceof Map) {
            Map<String, Object> map = (Map)this.data;
            String[] var3 = keys;
            int var4 = keys.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                String key = var3[var5];
                map.remove(key);
            }

            return this;
        } else {
            return this;
        }
    }

    public Result clearData() {
        this.data = null;
        return this;
    }

}
