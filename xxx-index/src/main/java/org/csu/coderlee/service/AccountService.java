package org.csu.coderlee.service;

import com.google.common.collect.Maps;
import org.csu.coderlee.dao.AccountDAO;
import org.csu.coderlee.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author by bixi.lx
 * @created on 2017 11 10 23:09
 */
@Service
public class AccountService {

    @Autowired
    AccountDAO accountDAO;

    public Account login(String username, String password) {
        return accountDAO.getAccount(username, password);
    }

    public Account login2(String username, String password) {
        Map<String, Object> map = Maps.newHashMap();
        map.put("username", username);
        map.put("password", password);
        return accountDAO.getAccount2(map);
    }
}
