package cn.bdqn.vo;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class DataView<T> {
    private int code;
    private String msg;
    private List<T> data;
    private Map<T,T> data1;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Map<T, T> getData1() {
        return data1;
    }

    public void setData1(Map<T, T> data1) {
        this.data1 = data1;
    }
}
