package com.example.CricBuzz.repository;

import com.example.CricBuzz.model.Player;
import com.example.CricBuzz.model.enums.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player,Integer> {
    List<Player> findAllByAgeGreaterThanEqual(int age);
    List<Player> findAllByAgeGreaterThanAndSpeciality(int age, Speciality speciality);
}
