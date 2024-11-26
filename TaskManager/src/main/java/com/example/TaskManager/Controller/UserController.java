package com.example.TaskManager.Controller;


import com.example.TaskManager.Service.UserService;
import com.example.TaskManager.dto.request.UserRequest;
import com.example.TaskManager.dto.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    UserService userService;

      @PostMapping("/register")
      public UserResponse userResponse(@RequestBody UserRequest userRequest){
          return userService.addUser(userRequest);
      }



}
