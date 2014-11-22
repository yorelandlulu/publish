package com.kun.flow.model;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2014/11/14.
 */
public class Summary {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    private String count;
    private BigDecimal userid;

    public BigDecimal getUserid() {
        return userid;
    }

    public void setUserid(BigDecimal userid) {
        this.userid = userid;
    }
}
