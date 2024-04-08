package cn.bdqn.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Data
public class Food implements Serializable {

    @JsonProperty("id")
    private String foodId;
    @JsonProperty("name")
    private String foodName;
    @JsonProperty("price")
    private Double foodPrice;
    @JsonProperty("description")
    private String foodDesc;
    @JsonProperty("icon")
    private String foodIcon;
    private String foodImage;
    private Integer foodTypeId;
    private Integer foodStatus;
    private Integer foodCount;
    private Date createTime;
    private Date updateTime;

    private FoodType foodType;

    private List<OrderDetail> orderDetailList;

}
