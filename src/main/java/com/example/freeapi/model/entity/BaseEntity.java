package com.example.freeapi.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    // Getters and setters
    @Column(nullable = false)
        @Temporal(TemporalType.TIMESTAMP)
        protected Date createdAt;

        @Column(nullable = false)
        @Temporal(TemporalType.TIMESTAMP)
        protected Date updatedAt;

        @PrePersist
        protected void onCreate() {
            updatedAt = createdAt = new Date();
        }

        @PreUpdate
        protected void onUpdate() {
            updatedAt = new Date();
        }



    }
