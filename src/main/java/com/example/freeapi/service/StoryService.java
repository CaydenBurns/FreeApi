package com.example.freeapi.service;

import com.example.freeapi.model.dto.StoryDTO;
import com.example.freeapi.model.entity.Story;
import com.example.freeapi.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StoryService {

    @Autowired
    private StoryRepository storyRepository;

    //business logic

    public List<StoryDTO> getAllStories() {
        List<Story> stories = storyRepository.findAll();
        return stories.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private StoryDTO convertToDto(Story story){
        StoryDTO dto = new StoryDTO();
        dto.setStoryId(story.getStoryID());
        dto.setTitle(story.getTitle());
        dto.setSynopsis(story.getSynopsis());
        return dto;

    }
}
