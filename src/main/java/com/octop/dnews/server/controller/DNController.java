package com.octop.dnews.server.controller;

import com.octop.dnews.server.entity.News;
import com.octop.dnews.server.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DNController {

    @Autowired
    private NewsService service;

    @RequestMapping(value = "/news", method = RequestMethod.GET)
    @ResponseBody
    public List<News> getAllNews(){
        return service.getAll();
    }

    @RequestMapping(value = "/news/id={id}", method = RequestMethod.GET)
    @ResponseBody
    public News getOneNews(@PathVariable("id") long newsID){
        return service.getByID(newsID);
    }

    @RequestMapping(value = "/news", method = RequestMethod.POST)
    @ResponseBody
    public News saveOneNews(@RequestBody News news){
        return service.save(news);
    }

    @RequestMapping(value = "/news/id={id}", method = RequestMethod.POST)
    @ResponseBody
    public void delete(@PathVariable("id") long newsID){
        service.remove(newsID);
    }
}
