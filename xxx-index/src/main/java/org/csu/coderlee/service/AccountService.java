package org.csu.coderlee.service;

import com.google.common.collect.Maps;
import org.csu.coderlee.dao.AccountMapper;
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
    AccountMapper accountMapper;

    public Account login(String username, String password) {
        return accountMapper.getAccount(username, password);
    }

    public Account login2(String username, String password) {
        Map<String, Object> map = Maps.newHashMap();
        map.put("username", username);
        map.put("password", password);
        return accountMapper.getAccount2(map);
    }
}
