package com.example.hackathonBoardTest.service;

import com.example.hackathonBoardTest.entity.Photo;
import com.example.hackathonBoardTest.repository.PhotoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Transactional
@Service
public class PhotoService {
    private final PhotoRepository photoRepository;
    @Transactional
    public void savePhoto(Photo photo){
        photoRepository.save(photo);
    }
}
