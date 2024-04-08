package cn.bdqn.controller;

import cn.bdqn.bean.OrderDetail;
import cn.bdqn.bean.Orders;
import cn.bdqn.dto.OrderId;
import cn.bdqn.form.OrderCreate;
import cn.bdqn.form.OrderList;
import cn.bdqn.service.OrderService;
import cn.bdqn.vo.DataView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单信息和订单详情
     * @param orderCreate
     * @return
     */
    @RequestMapping(value = "/buyer/order/create",method = RequestMethod.POST)
    public DataView addOrder(OrderCreate orderCreate){
        DataView<String> dv = new DataView<>();

        try {
            String orderId = orderService.addOrder(orderCreate);
//            OrderDetail orderDetail = new OrderDetail();
//            orderDetail.setOrderId(orderId);
//            OrderId orderid = new OrderId();
//            orderid.setOrderId(orderId);
            Map<String,String> map = new HashMap<>();
            map.put("orderId",orderId);
            dv.setCode(0);
            dv.setMsg("成功");
//            List<OrderId> list = new ArrayList<>();
//            list.add(orderid);
//            dv.setData(list);
            dv.setData1(map);
        } catch (Exception e) {
            dv.setCode(-1);
            dv.setMsg("失败");
            e.printStackTrace();
        }
        return dv;
    }

    /**
     * 订单列表
     * @param orderLi
     * @return
     */
    @RequestMapping(value = "/buyer/order/list",method = RequestMethod.POST)
    public DataView orderList(OrderList o1){
        List<Orders> list = orderService.orderList(o1);
        DataView<Orders> dv = new DataView<>();
        dv.setMsg("成功");
        dv.setCode(0);
        dv.setData(list);
        return dv;
    }


    /**
     * 订单详情
     */
    @RequestMapping(value = "/buyer/order/detail",method = RequestMethod.GET)
    public DataView orderDetail(String openid,String orderId){
        System.out.println("openid--"+openid);
        System.out.println("orderId--"+orderId);
        DataView<Orders> dv = new DataView();
        List<Orders> list = orderService.orderDetail(openid, orderId);
        dv.setData(list);
        dv.setCode(0);
        dv.setMsg("成功");
        return dv;
    }
}
