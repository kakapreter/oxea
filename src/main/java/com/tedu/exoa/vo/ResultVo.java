package com.tedu.exoa.vo;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ResultVo {
    private Integer code;
    private String message;
    private Map<String, Object> data = new HashMap<>();
    public ResultVo() {
    }
    public static ResultVo ok() {
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(Code.SUCCESS);
        resultVo.setMessage("成功");
        return resultVo;
    }
    public static ResultVo error() {
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(Code.ERROR);
        resultVo.setMessage("失败");
        return resultVo;
    }
    public ResultVo message(String message){
        this.setMessage(message);
        return this;
    }
    public ResultVo code(Integer code){
        this.setCode(code);
        return this;
    }
    public ResultVo data(String key,Object value){
        this.data.put(key,value);
        return this;
    }
    public ResultVo data(Map<String,Object> map){
        this.setData(map);
        return this;
    }
}
