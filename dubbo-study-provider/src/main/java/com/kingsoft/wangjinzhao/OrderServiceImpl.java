package com.kingsoft.wangjinzhao;

import com.kingsoft.wangjinzhao.model.Order;
import com.kingsoft.wangjinzhao.model.User;
import com.kingsoft.wangjinzhao.service.OrderService;
import com.kingsoft.wangjinzhao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by WANGJINZHAO on 2017/3/28.
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userService;

    public Order createOrder(Long buyerId, Integer amount) {
        User user=userService.findById(buyerId);
        Order order=new Order();
        order.setId(10000l);
        order.setAmount(amount);
        order.setBuyerId(user.getId());
        order.setCtime(new Date());
        order.setOrderName("美好");
        order.setOrderNo("12000191000188910");
        return order;
    }
}
