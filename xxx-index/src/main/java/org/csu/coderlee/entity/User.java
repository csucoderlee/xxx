package org.csu.coderlee.entity;

import java.io.Serializable;

/**
 * @author by csucoderlee
 * @created on 2017 11 02 15:50
 */
public class User implements Serializable{

    private String name;
    private Integer sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
