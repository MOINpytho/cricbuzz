package com.example.CricBuzz.controller;

import com.example.CricBuzz.dto.request.MatchRequest;
import com.example.CricBuzz.dto.response.MatchResponse;
import com.example.CricBuzz.exception.TeamNotFoundException;
import com.example.CricBuzz.model.CricketMatch;
import com.example.CricBuzz.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/match")
public class MatchController {
    @Autowired
    MatchService matchService;

    @PostMapping
    public ResponseEntity addMatch(@RequestBody MatchRequest matchRequest,
                                                  @RequestParam("teamA-id")int teamAId,
                                                  @RequestParam("teamB-id")int teamBId){
        try{
            return new ResponseEntity<>(matchService.addMatch(matchRequest,teamAId,teamBId), HttpStatus.CREATED);
        }catch (TeamNotFoundException e){
             return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
}
