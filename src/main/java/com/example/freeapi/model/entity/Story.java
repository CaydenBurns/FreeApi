package com.example.freeapi.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Stories")
public class Story extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StoryID")
    private Long storyID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CreatureID", nullable = false)
    private Creature creature;

    @Column(name = "Title", nullable = false)
    private String title;

    @Column(name = "StoryText", columnDefinition = "TEXT")
    private String storyText;

    @Column(name = "Synopsis", columnDefinition = "TEXT")
    private String synopsis;


}
