package com.octop.dnews.server.controller;

import com.octop.dnews.server.entity.News;
import com.octop.dnews.server.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/news")
public class DNController {

    @Autowired
    private NewsRepository newsRepository;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public News getNews(){
        List<News> list = newsRepository.findAll();
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
