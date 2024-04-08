package cn.bdqn.bean;


import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;


/**
 * 面向对象面向君  不负代码不负卿
 */
@Data
public class OrderDetail implements Serializable {
//    @JsonIgnore
    private String detailId;
    @JsonIgnore
    private String orderId;
//    @JsonIgnore
    private String productId;
    @JSONField(name="productQuantity") //前端返回的字段
//    @JsonIgnore
    private int productCount;//每个商品的购买数量

    @JsonIgnore
    private Orders order;
    @JsonIgnore
    private Food food;
}
