package com.example.TaskManager.Repository;

import com.example.TaskManager.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
