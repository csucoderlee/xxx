package org.csu.coderlee.entity;

import java.io.Serializable;

/**
 * @author by bixi.lx
 * @created on 2017 11 10 22:52
 */
public class Account implements Serializable{

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
