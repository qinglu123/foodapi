package cn.bdqn.mapper;

import cn.bdqn.bean.OrderDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OrderDetailMapper {
    int addOrderDetail(@Param("orderDetail") OrderDetail orderDetail);
}
