package org.csu.coderlee.dao;

import org.csu.coderlee.entity.User;

/**
 * @author by csucoderlee
 * @created on 2017 11 02 15:49
 */
public interface UserDAO {

    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    User queryById(long id);
}
