package com.example.freeapi.controller;

import com.example.freeapi.model.dto.CultureDTO;
import com.example.freeapi.service.CultureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cultures")
public class CultureController {

    @Autowired
    private CultureService cultureService;

    @GetMapping
    public ResponseEntity<List<CultureDTO>> getAllCultures() {
        List<CultureDTO> cultures = cultureService.getAllCultures();
        return ResponseEntity.ok(cultures);
                //Determine performance benchmarks between new responseentity and the latter
                //ResponseEntity<>(cultures, HttpStatus.OK);
    }



}
