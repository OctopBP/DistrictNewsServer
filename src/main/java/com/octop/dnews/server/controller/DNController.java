package com.octop.dnews.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/news")
public class DNController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getNews(ModelMap model){
        return "My news";
    }
}
