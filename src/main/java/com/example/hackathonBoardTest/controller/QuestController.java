package com.example.hackathonBoardTest.controller;

import com.example.hackathonBoardTest.dto.QuestRequestsDto;
import com.example.hackathonBoardTest.dto.QuestResponseDto;
import com.example.hackathonBoardTest.dto.SuccessResponseDto;
import com.example.hackathonBoardTest.service.QuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class QuestController {
    private final QuestService boardService;

    @GetMapping("/api/quest/list")
    public List<QuestResponseDto> getQuests() {
        return boardService.getQuests();
    }

    @PostMapping("/api/quest/create")
    public QuestResponseDto createQuest(@RequestBody QuestRequestsDto requestsDto) {
        return boardService.createQuest(requestsDto);
    }

    @GetMapping("/api/quest/{id}")
    public QuestResponseDto getQuest(@PathVariable long id) {
        return boardService.getQuest(id);
    }

    @DeleteMapping("/api/quest/{id}")
    public SuccessResponseDto deleteQuest(@PathVariable long id, @RequestBody QuestRequestsDto requestsDto) throws Exception {
        return boardService.deleteQuest(id, requestsDto);
    }
}
