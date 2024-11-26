package com.example.TaskManager.Model;

import com.example.TaskManager.Model.Enum.Priority;
import com.example.TaskManager.Model.Enum.Status;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Builder
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String title;

    String description;

    Date due_date;

    @Enumerated(EnumType.STRING)
    Priority priority;

    @Enumerated(EnumType.STRING)
    Status status;

//    @ManyToOne
//    @JoinColumn
//    @JsonManagedReference
//    User user_id;
}
