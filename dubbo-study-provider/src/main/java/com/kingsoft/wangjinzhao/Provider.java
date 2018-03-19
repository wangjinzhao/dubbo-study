package com.kingsoft.wangjinzhao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by WANGJINZHAO on 2017/3/14.
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "dubbo-provider.xml" });
        context.start();
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
    }
}
