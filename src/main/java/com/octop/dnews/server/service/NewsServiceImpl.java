package com.octop.dnews.server.service;

import com.octop.dnews.server.entity.News;
import com.octop.dnews.server.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepository newsRepository;

    public List<News> getAll() {
        return newsRepository.findAll();
    }

    public News getByID(long id) {
        return newsRepository.findOne(id);
    }

    public News save(News news) {
        return newsRepository.saveAndFlush(news);
    }

    public void remove(long id) {
        newsRepository.delete(id);
    }
}
