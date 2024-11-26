package com.example.TaskManager.Converter;

import com.example.TaskManager.Model.Tasks;
import com.example.TaskManager.dto.request.TaskRequest;
import com.example.TaskManager.dto.response.TaskResponse;

public class TaskConverter {
    public static Tasks taskRequestToTask(TaskRequest taskRequest){
        return Tasks.builder()
                .title(taskRequest.getTitle())
                .description(taskRequest.getDescription())
                .due_date(taskRequest.getDue_date())
                .status(taskRequest.getStatus())
                .priority(taskRequest.getPriority())
                .build();
    }

    public static TaskResponse taskToTaskResponse(Tasks task){
        return TaskResponse.builder()
                .title(task.getTitle())
                .description(task.getDescription())
                .due_date(task.getDue_date())
                .status(task.getStatus())
                .build();
    }
}
