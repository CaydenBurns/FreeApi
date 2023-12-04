package com.example.freeapi.service;

import com.example.freeapi.model.dto.CultureDTO;
import com.example.freeapi.model.entity.Culture;
import com.example.freeapi.repository.CultureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CultureService {

    @Autowired
    private CultureRepository cultureRepository;

    //business logic

    public List<CultureDTO> getAllCultures() {
        List<Culture> cultures = cultureRepository.findAll();
        return cultures.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private CultureDTO convertToDto(Culture culture){
        CultureDTO dto = new CultureDTO();
        dto.setCultureId(culture.getCultureId());
        dto.setName(culture.getName());
        dto.setDescription(culture.getDescription());
        return dto;

    }
}
