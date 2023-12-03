package com.example.freeapi.model.dto;

import lombok.Data;

@Data
public class CreatureDTO {
    private Long creatureID;
    private String name;
    private Long cultureID;
    private String description;
    private String legendaryOrigin;

}
