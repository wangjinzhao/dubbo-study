package com.kingsoft.wangjinzhao;

import com.kingsoft.wangjinzhao.model.User;
import com.kingsoft.wangjinzhao.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by WANGJINZHAO on 2017/3/28.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    public User findById(Long userId) {
        User user=new User();
        user.setId(userId);
        user.setPasswd("admin");
        user.setUsername("admin");
        return user;
    }
}
