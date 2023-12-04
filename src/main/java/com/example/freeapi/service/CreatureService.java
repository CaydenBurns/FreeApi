package com.example.freeapi.service;

import com.example.freeapi.model.dto.CreatureDTO;
import com.example.freeapi.model.entity.Creature;
import com.example.freeapi.repository.CreatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CreatureService {

    @Autowired
    private CreatureRepository creatureRepository;

    //business logic
    public List<CreatureDTO> getAllCreatures() {
        List<Creature> creatures = creatureRepository.findAll();
        return creatures.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    // Helper method to convert Creature entity to CreatureDTO
    private CreatureDTO convertToDto(Creature creature) {
        // Assuming you have a constructor in CreatureDTO that accepts a Creature object
        // you can set properties manually.
        CreatureDTO dto = new CreatureDTO();
        dto.setCreatureID(creature.getCreatureID());
        dto.setName(creature.getName());
        dto.setCultureID(creature.getCultureID());
        dto.setDescription(creature.getDescription());
        dto.setLegendaryOrigin(creature.getLegendaryOrigin());
        //dto.setCreatedAt(creature.getCreatedAt());
        //dto.setUpdatedAt(creature.getUpdatedAt());
        return dto;
    }
}
