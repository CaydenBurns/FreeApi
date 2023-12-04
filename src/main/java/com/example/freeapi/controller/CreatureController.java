package com.example.freeapi.controller;

import com.example.freeapi.model.dto.CreatureDTO;
import com.example.freeapi.service.CreatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/creatures")
public class CreatureController {

    @Autowired
    private CreatureService creatureService;

    @GetMapping
    public ResponseEntity<List<CreatureDTO>> getAllCreatures() {
        List<CreatureDTO> creatures = creatureService.getAllCreatures();
        return new ResponseEntity<>(creatures, HttpStatus.OK);
    }


    /*
    * // Get a single creature by ID
    @GetMapping("/{id}")
    public ResponseEntity<CreatureDTO> getCreatureById(@PathVariable Long id) {
        CreatureDTO creature = creatureService.getCreatureById(id);
        return new ResponseEntity<>(creature, HttpStatus.OK);
    }

    // Create a new creature
    @PostMapping
    public ResponseEntity<CreatureDTO> createCreature(@RequestBody CreatureDTO creatureDTO) {
        CreatureDTO newCreature = creatureService.createCreature(creatureDTO);
        return new ResponseEntity<>(newCreature, HttpStatus.CREATED);
    }

    // Update an existing creature
    @PutMapping("/{id}")
    public ResponseEntity<CreatureDTO> updateCreature(@PathVariable Long id, @RequestBody CreatureDTO creatureDTO) {
        CreatureDTO updatedCreature = creatureService.updateCreature(id, creatureDTO);
        return new ResponseEntity<>(updatedCreature, HttpStatus.OK);
    }

    // Delete a creature
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCreature(@PathVariable Long id) {
        creatureService.deleteCreature(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
*/
}
