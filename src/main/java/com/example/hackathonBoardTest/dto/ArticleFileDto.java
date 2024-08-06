package com.example.hackathonBoardTest.dto;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class ArticleFileDto {
    private String title;
    private String content;
    private String hashtag;
    private List<MultipartFile> files;
}
