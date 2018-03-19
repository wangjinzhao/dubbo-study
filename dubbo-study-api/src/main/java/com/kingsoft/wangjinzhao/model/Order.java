package com.kingsoft.wangjinzhao.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by WANGJINZHAO on 2017/3/28.
 */
public class Order  implements Serializable{
    private static final long serialVersionUID = 6649912547138591674L;
    private Long id;

    private String orderNo;

    private String orderName;

    private Long buyerId;

    private Integer amount;

    private Date ctime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", orderName='" + orderName + '\'' +
                ", buyerId=" + buyerId +
                ", amount=" + amount +
                ", ctime=" + ctime +
                '}';
    }
}
