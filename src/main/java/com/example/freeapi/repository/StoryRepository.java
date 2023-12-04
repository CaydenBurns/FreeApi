package com.example.freeapi.repository;

import com.example.freeapi.model.entity.Story;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryRepository extends JpaRepository<Story,Long> {
}
