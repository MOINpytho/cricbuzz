package com.example.TaskManager.Service;

import com.example.TaskManager.Converter.UserConverter;
import com.example.TaskManager.Model.User;
import com.example.TaskManager.Repository.UserRepo;
import com.example.TaskManager.dto.request.UserRequest;
import com.example.TaskManager.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
     final UserRepo userRepo;
    public UserResponse addUser( UserRequest userRequest){
         User user = UserConverter.userRequestToUserConverter(userRequest);
         User savedUser = userRepo.save(user);
         return UserConverter.userToUserResponse(savedUser);
     }
}
