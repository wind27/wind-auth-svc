package com.wind.auth.controller;

import com.wind.auth.model.User;
import com.wind.auth.service.IUserService;
import com.wind.commons.ErrorCode;
import com.wind.utils.JsonResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 * UserController
 *
 * @author qianchun 17/11/1
 **/
@RestController
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;


    @RequestMapping("/user/{id}")
    public String findById(Model model, @PathVariable("id") long id) {
        if(id<=0) {
            return JsonResponseUtil.fail(ErrorCode.PARAM_ERROR);
        }
        User user = userService.findById(id);
        if(user==null) {
            return JsonResponseUtil.fail(ErrorCode.PARAM_ERROR);
        }
        return JsonResponseUtil.ok(user);
    }
}
