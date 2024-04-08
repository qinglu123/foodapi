package cn.bdqn.bean;

import cn.bdqn.dto.FoodList;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class FoodType implements Serializable {
    @JsonProperty("type")  //返回的JSON数据中的key值
    private int typeId;
    @JsonProperty("name")
    private String typeName;
    @JsonIgnore //转换JSON时忽略该属性
    private Date createTime;
    @JsonIgnore
    private Date updateTime;

    @JsonProperty("foods")
    private List<FoodList> foodList;

}
