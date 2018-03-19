package com.kingsoft.wangjinzhao.model;

import java.io.Serializable;

/**
 * Created by WANGJINZHAO on 2017/3/28.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 165117899253800498L;
    private Long id;

    private String username;

    private String passwd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
