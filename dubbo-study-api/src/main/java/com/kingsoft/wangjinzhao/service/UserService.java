package com.kingsoft.wangjinzhao.service;

import com.kingsoft.wangjinzhao.model.User;

/**
 * Created by WANGJINZHAO on 2017/3/28.
 */
public interface UserService {

    User findById(Long userId);
}
