package com.example.TaskManager.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int id;

        String name;

        String email;

        String password;

//        @OneToMany(mappedBy = "user")
//        @JsonBackReference
//        List<Tasks> task;
}
