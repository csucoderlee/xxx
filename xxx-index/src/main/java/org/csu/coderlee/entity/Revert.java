package org.csu.coderlee.entity;

import java.io.Serializable;

/**
 * @author by bixi.lx
 * @created on 2017 11 13 22:48
 */
public class Revert implements Serializable{

    private Long topicId;

    private Long accountId;

    private String content;

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
