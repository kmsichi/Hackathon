package com.example.hackathonBoardTest.repository;

import com.example.hackathonBoardTest.entity.Quest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestRepository extends JpaRepository<Quest, Long> {
    List<Quest> findAllByOrderByModifiedAtDesc();
}
