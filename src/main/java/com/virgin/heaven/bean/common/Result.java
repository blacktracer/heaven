package com.virgin.heaven.bean.common;

import lombok.Data;

@Data
public class Result<T> {
    private boolean status;
    private String code;
    private String msg;
    private T data;

    public static <T> Result<T> success(T data){
        Result<T> r = new Result<T>();
        r.setStatus(true);
        r.setData(data);
        return r;
    }

    public static Result fail(String code, String msg){
        Result r = new Result();
        r.setStatus(false);
        r.setCode(code);
        r.setMsg(msg);
        return r;
    }
}
