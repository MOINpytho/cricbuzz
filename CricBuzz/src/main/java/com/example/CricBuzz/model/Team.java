package com.example.CricBuzz.model;

import com.example.CricBuzz.model.enums.Gender;
import com.example.CricBuzz.model.enums.Speciality;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.List;

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

    String teamName;

    @Column(name = "ranking", unique = true)
    int ranking;

    int iccPoints;

    String coach;

    @OneToMany(mappedBy = "team")
    @JsonBackReference
    List<Player> players;

    @ManyToMany(mappedBy = "teams")
    @JsonBackReference
    List<CricketMatch> matches;
}
