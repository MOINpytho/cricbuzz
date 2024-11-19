package com.example.CricBuzz.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PlayerProfile {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    @Column(name = "ranking", unique = true)
    int runsScored;

    int wicketsTaken;

    double battingAvg;

    double bowlingAvg;


}
