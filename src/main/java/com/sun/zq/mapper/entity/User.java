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
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long userId;
    private String userName;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
        ", userId = " + userId +
        ", userName = " + userName +
        "}";
    }
}
