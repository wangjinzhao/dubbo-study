package com.kingsoft.wangjinzhao.service;

import com.kingsoft.wangjinzhao.model.Order;

/**
 * Created by WANGJINZHAO on 2017/3/28.
 */
public interface OrderService {

    Order createOrder(Long buyerId,Integer amount);

}
