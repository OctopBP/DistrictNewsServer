package com.octop.dnews.server.controller;

import com.octop.dnews.server.entity.News;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/news")
public class DNController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public News getNews(){
        return createMockNews();
    }

    private News createMockNews() {
        News news = new News();
        news.setId(1);
        news.setTitle("Good news, evreone");
        news.setNewsDate(new Date());

        return news;
    }
}
