package com.example.TaskManager.Controller;

import com.example.TaskManager.Service.TaskService;
import com.example.TaskManager.dto.request.TaskRequest;
import com.example.TaskManager.dto.response.TaskResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tasks")
@RequiredArgsConstructor
public class TaskController {

    final TaskService taskService;
    @PostMapping
    public TaskResponse taskResponse(@RequestBody TaskRequest taskRequest){
        return taskService.addTask(taskRequest);
    }
}
