package cn.bdqn.dto;

import lombok.Data;

@Data
public class Product {
    private String detailId;
    private String orderId;
    private String productId;
    private String productName;
    private double productPrice;
    private int productQuantity;
    private String productIcon;
    private String productImage;
}
