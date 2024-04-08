package cn.bdqn.service;

import cn.bdqn.bean.Orders;
import cn.bdqn.form.OrderCreate;
import cn.bdqn.form.OrderList;

import java.util.List;
import java.util.Map;

public interface OrderService {
    String addOrder(OrderCreate orderCreate);
    List<Orders> orderList(OrderList o1);
    List<Orders> orderDetail(String openId,String orderId);
}
