package com.grand.enoteboot.dto;

/**
 * @author GrandX
 */

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

/**
 * 自定义响应结构
 */
public class ResponseVO implements Serializable {

    /** 定义jackson对象 */
    private static final ObjectMapper MAPPER = new ObjectMapper();

    /** 响应业务状态 */
    private Integer status;

    /** 响应消息 */
    private String msg;

    /** 响应中的数据 */
    private Object data;

    public static ResponseVO build(Integer status, String msg, Object data) {
        return new ResponseVO(status, msg, data);
    }

    public static ResponseVO ok(Object data) {
        return new ResponseVO(data);
    }

    public static ResponseVO ok() {
        return new ResponseVO(null);
    }

    public ResponseVO() {

    }

    public static ResponseVO    build(Integer status, String msg) {
        return new ResponseVO(status, msg, null);
    }

    public ResponseVO(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ResponseVO(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Boolean isOK() {
        return this.status == 200;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }



}

