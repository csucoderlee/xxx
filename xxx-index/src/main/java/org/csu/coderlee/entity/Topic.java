package org.csu.coderlee.entity;

import java.io.Serializable;

/**
 * @author by bixi.lx
 * @created on 2017 11 13 22:31
 */
public class Topic implements Serializable {

    private Long id;
    private String theme;

    /**
     * 对应account的id
     */
    private Long createrId;
    private Long created;
    private Long modified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Long getCreaterId() {
        return createrId;
    }

    public void setCreaterId(Long createrId) {
        this.createrId = createrId;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Long getModified() {
        return modified;
    }

    public void setModified(Long modified) {
        this.modified = modified;
    }
}
