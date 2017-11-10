package org.csu.coderlee.dao;

import org.apache.ibatis.annotations.Param;
import org.csu.coderlee.entity.Account;

/**
 * @author by bixi.lx
 * @created on 2017 11 10 22:51
 */
public interface AccountDAO {

    /**
     * 根据用户名和密码来获取账户
     * @param username
     * @param password
     * @return
     */
    Account getAccount(@Param("username") String username, @Param("password") String password);
}
