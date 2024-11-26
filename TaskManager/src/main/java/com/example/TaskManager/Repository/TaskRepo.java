package com.example.TaskManager.Repository;

import com.example.TaskManager.Model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Tasks,Integer> {
}
