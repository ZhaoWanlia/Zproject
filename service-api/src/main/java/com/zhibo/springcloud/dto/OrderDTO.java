package com.zhibo.springcloud.dto;
//模块之间传递数据
public class OrderDTO {
    private Integer orderId;
    private String orderName;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
