package org.csu.coderlee.controller;

import org.csu.coderlee.dao.UserDAO;
import org.csu.coderlee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author by csucoderlee
 * @created on 2017 11 02 11:19
 */
@Controller
public class IndexController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public Object index() {
        return "index";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public Object User(Long id) {
        return userService.queryById(id);
    }
}
