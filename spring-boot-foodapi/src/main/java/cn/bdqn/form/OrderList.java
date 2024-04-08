package cn.bdqn.form;

import lombok.Data;

@Data
public class OrderList {
    private String openid;//微信号
    private int page = 0;//从第0页开始
    private int size = 3;//页容量
}
