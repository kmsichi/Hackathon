package com.example.hackathonBoardTest.controller;

import com.example.hackathonBoardTest.repository.PhotoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class PhotoController {
    private final PhotoRepository photoRepository;

    @PostMapping
    public QuestPhotoDto upload(@RequestPart (value = "photofiles") MultipartFile file) throws IOException {

    }
}
