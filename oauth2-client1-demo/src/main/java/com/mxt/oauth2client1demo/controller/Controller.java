package com.mxt.oauth2client1demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Simple
 * @date 2021/2/22 9:47
 */
@RestController
@RequestMapping("/user")
public class Controller {

    @RequestMapping("/getCurrentUser")
    public Object getCurrentUser(Authentication authentication){
        return authentication;
    }
}
