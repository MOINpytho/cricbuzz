package com.example.CricBuzz.repository;

import com.example.CricBuzz.model.CricketMatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<CricketMatch,Integer> {
}
