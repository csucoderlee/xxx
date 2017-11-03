package org.csu.coderlee.service;

import org.csu.coderlee.dao.UserDAO;
import org.csu.coderlee.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author by bixi.lx
 * @created on 2017 11 03 08:16
 */
@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    public User queryById(long id) {
        return userDAO.queryById(id);
    }
}
