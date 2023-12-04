package com.example.freeapi.model.dto;

import lombok.Data;

@Data
public class StoryDTO {
    private Long storyId;
    private String creature;
    private String title;
    private String storyText;
    private String synopsis;


}
