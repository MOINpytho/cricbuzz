package com.example.TaskManager.Converter;


import com.example.TaskManager.Model.User;
import com.example.TaskManager.dto.request.UserRequest;
import com.example.TaskManager.dto.response.UserResponse;

public class UserConverter {

    public static User userRequestToUserConverter(UserRequest userRequest){
        return User.builder()
                .name(userRequest.getName())
                .email(userRequest.getEmail())
                .password(userRequest.getPassword())
                .build();
    }

    public static UserResponse userToUserResponse(User user){
        return UserResponse.builder()
                .name(user.getName())
                .email(user.getEmail())
                .build();
    }
}
