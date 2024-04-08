package cn.bdqn.service.impl;

import cn.bdqn.bean.OrderDetail;
import cn.bdqn.bean.Orders;
import cn.bdqn.enums.OrderStatus;
import cn.bdqn.enums.PayStatus;
import cn.bdqn.form.OrderCreate;
import cn.bdqn.form.OrderList;
import cn.bdqn.mapper.OrderDetailMapper;
import cn.bdqn.mapper.OrderMapper;
import cn.bdqn.service.OrderService;
import cn.bdqn.util.DateFormatUtil;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    /**
     * 添加订单和订单详情
     * @param orderCreate
     * @return
     */
    @Override
    @Transactional //增加事务管理
    public String addOrder(OrderCreate orderCreate) {
        Orders orders = new Orders();
        String orderId= DateFormatUtil.formatDateTime(new Date());
        orders.setOrderId(orderId);
        orders.setOpenId(orderCreate.getOpenid());
        orders.setBuyerName(orderCreate.getName());
        orders.setBuyerPhone(orderCreate.getPhone());
        orders.setBuyerAddress(orderCreate.getAddress());
        orders.setCreateTime(new Date());
        orders.setOrderStatus(OrderStatus.ORDERED.getNum());//数据字典
        orders.setPayStatus(PayStatus.UNPAID.getNum());
        //json转java
        String items = orderCreate.getItems();//[{productId: f101,productQuantity: 2 //购买数量 }]
        List<OrderDetail> list = JSONObject.parseArray(items, OrderDetail.class);
        orders.setOrderAmount((double) list.size());
        orderMapper.addOrder(orders);

        for (OrderDetail orderDetail:list){
            orderDetail.setOrderId(orderId);
//            String detailId= DateFormatUtil.formatDate(new Date());
//            orderDetail.setDetailId(detailId);
            orderDetail.setDetailId(UUID.randomUUID().toString().substring(0,7));
            orderDetailMapper.addOrderDetail(orderDetail);
        }
        return orderId;
    }

    /**
     * 订单列表
     * @param orderList
     * @return
     */
    @Override
    public List<Orders> orderList(OrderList o1) {
        PageHelper.startPage(o1.getPage()+1,o1.getSize());
//        System.out.println(o1.getOpenid());
        List<Orders> list = orderMapper.orderList(o1.getOpenid());
        return list;
    }

    @Override
    public List<Orders> orderDetail(String openId, String orderId) {
        Map<String,String> map = new HashMap();
        map.put("openId",openId);
        map.put("orderId",orderId);
        return orderMapper.orderdetail(map);
    }
}
