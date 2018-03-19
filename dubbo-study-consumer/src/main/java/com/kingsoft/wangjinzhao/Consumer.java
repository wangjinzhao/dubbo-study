package com.kingsoft.wangjinzhao;

import com.kingsoft.wangjinzhao.model.Order;
import com.kingsoft.wangjinzhao.model.User;
import com.kingsoft.wangjinzhao.service.OrderService;
import com.kingsoft.wangjinzhao.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class Consumer {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"dubbo-consumer.xml"});
        context.start();
        UserService userService = (UserService) context.getBean("userService");
        OrderService orderService = (OrderService) context.getBean("orderService");

        User user=userService.findById(1l);
//        Order order=orderService.createOrder(1l,100);
        System.out.println(user.toString());
//        System.out.println(order.toString());
    }
}
