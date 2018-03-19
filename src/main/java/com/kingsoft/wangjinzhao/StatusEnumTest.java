package com.kingsoft.wangjinzhao;

/**
 * Created by WANGJINZHAO on 2017/3/14.
 */
public class StatusEnumTest {

    public static void main(String[] args) {
        StatusEnum statusCode=StatusEnum.Ok;
        String responseCode=statusCode.name();
        System.out.println(responseCode);
        String resCode=statusCode.toString();
        System.out.println(resCode);
        StatusEnum [] vals=StatusEnum.values();
    }

}
