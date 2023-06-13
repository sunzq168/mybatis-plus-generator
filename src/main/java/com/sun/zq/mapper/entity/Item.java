package com.sun.zq.mapper.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author sunzheng
 * @since 2023-06-13
 */
@TableName("order_item")
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long orderItemId;
    private Integer orderId;

    public Long getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Item{" +
        ", orderItemId = " + orderItemId +
        ", orderId = " + orderId +
        "}";
    }
}
