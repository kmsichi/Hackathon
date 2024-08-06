package com.example.hackathonBoardTest.repository;

import com.example.hackathonBoardTest.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends JpaRepository<Photo,Long> {

}
