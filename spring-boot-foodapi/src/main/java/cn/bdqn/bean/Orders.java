package cn.bdqn.bean;

import cn.bdqn.dto.Product;
import cn.bdqn.util.DateToLong;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class Orders implements Serializable {
    private String orderId;
    @JsonProperty("buyerOpenid")
    private String openId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private Double orderAmount;
    private int orderStatus;
    private int payStatus;
    @JsonIgnore
    private String orderDesc;
    @JsonSerialize(using = DateToLong.class)
    private Date createTime;
    @JsonSerialize(using = DateToLong.class)
    private Date updateTime;


    @JsonIgnore
    private Integer userid;
    @JsonIgnore
    private Users users;
    @JsonIgnore
    private List<OrderDetail> orderDetailList;

    @JsonProperty("orderDetailList")
    private List<Product> orderProduct;
}
