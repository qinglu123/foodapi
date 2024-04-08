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

    @Override
    public String toString() {
        return "DataView{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", data1=" + data1 +
                '}';
    }
}
