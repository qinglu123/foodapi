package cn.bdqn.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 2019/7/8
 * Administrator
 * springboot0708
 * 面向对象面向君  不负代码不负卿
 */
@Data
public class Users implements Serializable {
    private Integer userId;
    private String userName;
    private String phone;
    private String openId;
    private String address;

    private List<Orders> orderList;

}
