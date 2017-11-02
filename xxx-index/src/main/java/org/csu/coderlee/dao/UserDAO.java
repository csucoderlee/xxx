package org.csu.coderlee.dao;

import org.csu.coderlee.entity.User;

/**
 * @author by csucoderlee
 * @created on 2017 11 02 15:49
 */
public interface UserDAO {

    User queryById(long id);
}
