package com.octop.dnews.server.service;

import com.octop.dnews.server.entity.News;

import java.util.List;

public interface NewsService {

    List<News> getAll();
    News getByID(long id);
    News save(News news);
    void remove(long id);

}
