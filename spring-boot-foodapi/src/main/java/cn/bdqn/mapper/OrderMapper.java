package cn.bdqn.mapper;

import cn.bdqn.bean.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface OrderMapper {
    int addOrder(@Param("orders") Orders orders);
    List<Orders> orderList(@Param("openId") String openId);
//    List<Orders> orderdetail(@Param("openId") String openId,@Param("orderId") String orderId);
    List<Orders> orderdetail(Map map);
}
