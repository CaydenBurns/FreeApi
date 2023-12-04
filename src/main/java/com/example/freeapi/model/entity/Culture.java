package com.example.freeapi.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "culture")
public class Culture extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "culture_id")
    private Long cultureId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "culture", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Creature> creatures = new ArrayList<>();

    // Convenience method for bi-directional relationship
    public void addCreature(Creature creature) {
        creatures.add(creature);
        creature.setCulture(this);
    }

    public void removeCreature(Creature creature) {
        creatures.remove(creature);
        creature.setCulture(null);
    }

}
