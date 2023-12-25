package com.example.firstproject1.repository;

import com.example.firstproject1.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ArticleRepository extends CrudRepository<Article ,Long> {
    @Override
    ArrayList<Article> findAll();
}
