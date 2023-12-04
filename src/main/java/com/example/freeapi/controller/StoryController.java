package com.example.freeapi.controller;

import com.example.freeapi.model.dto.StoryDTO;
import com.example.freeapi.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stories")
public class StoryController {


    @Autowired
    private StoryService storyService;

    @GetMapping
    public ResponseEntity<List<StoryDTO>> getAllStories(){
        List<StoryDTO> stories = storyService.getAllStories();
        return ResponseEntity.ok(stories);
    }

}
