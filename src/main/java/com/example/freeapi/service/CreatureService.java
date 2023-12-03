package com.example.freeapi.service;

import com.example.freeapi.repository.CreatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatureService {

    @Autowired
    private CreatureRepository creatureRepository;

    //business logic
}
