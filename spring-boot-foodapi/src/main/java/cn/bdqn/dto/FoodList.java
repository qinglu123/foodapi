package cn.bdqn.dto;

import lombok.Data;

@Data
public class FoodList {
    private String id;
    private String name;
    private Double price;
    private String description;
    private String icon;
}
