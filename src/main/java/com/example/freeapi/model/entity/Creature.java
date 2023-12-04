package com.example.freeapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Creatures")
public class Creature extends BaseEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long creatureID;

        @Column(nullable = false)
        private String name;

        @Column(nullable = false)
        private Long cultureID;

        @Column(length = 1000)
        private String description;

        @Column(length = 500)
        private String legendaryOrigin;

        @ManyToOne
        @JoinColumn(name = "culture_id", nullable = false)
        private Culture culture;




}
