package com.example.freeapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.freeapi.model.entity.Country;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country,Long> {
    List<Country> findCountriesByName(String name);
}
