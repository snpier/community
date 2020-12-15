package com.example.forum.model;

import lombok.Data;

@Data
public class Question {
    private Integer id;
    private String title;
    private String content;
    private Long gmtCreate;
    private Long gmtModifed;
    private Integer creator;
    private Integer comment_count;
    private Integer view_count;
    private Integer like_count;
    private String tags;
}
