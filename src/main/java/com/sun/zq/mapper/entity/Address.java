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
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer addressId;
    private String addressName;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    @Override
    public String toString() {
        return "Address{" +
        ", addressId = " + addressId +
        ", addressName = " + addressName +
        "}";
    }
}
