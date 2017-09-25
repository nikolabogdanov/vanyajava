package com.vanya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nikola on 7/31/2017.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public  String showIndex() {
        return "index";
    }
}
