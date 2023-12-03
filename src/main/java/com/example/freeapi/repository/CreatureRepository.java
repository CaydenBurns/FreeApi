package com.example.freeapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.freeapi.model.entity.Creature;

public interface CreatureRepository extends JpaRepository<Creature,Long> {

}
