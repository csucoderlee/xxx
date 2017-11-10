package org.csu.coderlee.service;

import org.csu.coderlee.dao.AccountDAO;
import org.csu.coderlee.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
