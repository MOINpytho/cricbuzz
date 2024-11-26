package com.example.TaskManager.dto.request;

import com.example.TaskManager.Model.Enum.Priority;
import com.example.TaskManager.Model.Enum.Status;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskRequest {
    String title;

    String description;

    Date due_date;

    Priority priority;

    Status status;
}
