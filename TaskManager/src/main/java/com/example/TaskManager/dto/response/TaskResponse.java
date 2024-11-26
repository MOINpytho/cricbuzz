package com.example.TaskManager.dto.response;

import com.example.TaskManager.Model.Enum.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class TaskResponse {
    String title;

    String description;

    Date due_date;

    Status status;
}
