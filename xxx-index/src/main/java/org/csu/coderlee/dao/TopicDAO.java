package org.csu.coderlee.dao;

import org.csu.coderlee.entity.Topic;

import java.util.List;

/**
 * @author by bixi.lx
 * @created on 2017 11 15 09:05
 */
public interface TopicDAO {

    /**
     * 获取帖子列表
     * @return
     */
    List<Topic> list();

    Topic insert(Topic topic);
}
