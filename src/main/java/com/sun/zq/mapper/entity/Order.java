package com.sun.zq.mapper.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author sunzheng
 * @since 2023-06-13
 */
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer orderId;
    private Integer userId;
    private Integer addressId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @Override
    public String toString() {
        return "Order{" +
        ", orderId = " + orderId +
        ", userId = " + userId +
        ", addressId = " + addressId +
        "}";
    }
}
