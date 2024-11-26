package com.example.TaskManager.Service;

import com.example.TaskManager.Converter.TaskConverter;
import com.example.TaskManager.Model.Tasks;
import com.example.TaskManager.Repository.TaskRepo;
import com.example.TaskManager.dto.request.TaskRequest;
import com.example.TaskManager.dto.response.TaskResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class TaskService {

    final TaskRepo taskRepo;
    public TaskResponse addTask(TaskRequest taskRequest) {
        Tasks task = TaskConverter.taskRequestToTask(taskRequest);
        Tasks savedTask = taskRepo.save(task);
        return TaskConverter.taskToTaskResponse(savedTask);
    }
}
