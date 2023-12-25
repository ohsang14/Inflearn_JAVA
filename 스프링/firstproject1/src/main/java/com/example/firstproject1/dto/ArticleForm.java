package com.example.firstproject1.dto;

import com.example.firstproject1.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private Long id;
    private String title; // 제목 받을 필드
    private String content; // 내용 받을 필드

    public Article toEntity() {
        return new Article(id, title,content);
    }
}
