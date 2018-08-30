package com.byk.rong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: ykbian
 * @Date: 2018/8/30 19:18
 * @Todo:
 */
@Controller
public class HomeController {

    @RequestMapping(value = {"/",""})
    public String toIndex(){
        return "index";
    }
}
