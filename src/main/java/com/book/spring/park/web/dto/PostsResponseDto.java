package com.book.spring.park.web.dto;

import com.book.spring.park.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    // 글 상세보기를 위한 Dto
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
