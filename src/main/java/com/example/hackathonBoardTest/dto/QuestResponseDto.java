package com.example.hackathonBoardTest.dto;

import com.example.hackathonBoardTest.entity.Quest;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class QuestResponseDto {
    private Long id;
    private String title;
    private int contents;
    private String author;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public QuestResponseDto(Quest entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.contents = entity.getContents();
        this.author = entity.getAuthor();
        this.createdAt = entity.getCreatedAt();
        this.modifiedAt = entity.getModifiedAt();
    }
}
