package com.octop.dnews.server.repository;

import com.octop.dnews.server.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
