package com.example.freeapi.repository;

import com.example.freeapi.model.entity.Culture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CultureRepository extends JpaRepository<Culture,Long> {
}
