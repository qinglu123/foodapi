package cn.bdqn.form;

import lombok.Data;


@Data
public class OrderCreate {
    private String name;
    private String phone;
    private String address;
    private String openid;
    private String items;
}
