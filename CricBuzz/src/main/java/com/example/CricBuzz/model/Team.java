package com.example.CricBuzz.model;

import com.example.CricBuzz.model.enums.Gender;
import com.example.CricBuzz.model.enums.Speciality;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Team {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    int age;

    Gender gender;

    Speciality speciality;
}
