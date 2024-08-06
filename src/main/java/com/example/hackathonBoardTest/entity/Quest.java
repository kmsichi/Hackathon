package com.example.hackathonBoardTest.entity;

import com.example.hackathonBoardTest.dto.QuestRequestsDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Entity
@Setter
@NoArgsConstructor
public class Quest extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private int contents;

    @Column(nullable = false)
    private String author;

    public Quest(QuestRequestsDto requestsDto) {
        this.title = requestsDto.getTitle();
        this.contents = 0;
        this.author = requestsDto.getAuthor();
    }

    public void update(QuestRequestsDto requestsDto) {
        this.title = requestsDto.getTitle();
        this.contents = requestsDto.getContents();
        this.author = requestsDto.getAuthor();
    }

}
