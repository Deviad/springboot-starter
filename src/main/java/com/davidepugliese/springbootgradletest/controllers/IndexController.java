package com.davidepugliese.springbootgradletest.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
//@RequestMapping("/user")
public class IndexController {
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        return "index";
    }
}
