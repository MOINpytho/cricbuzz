package com.example.CricBuzz.controller;

import com.example.CricBuzz.dto.request.PlayerRequest;
import com.example.CricBuzz.dto.request.ProfileRequest;
import com.example.CricBuzz.dto.response.ProfileResponse;
import com.example.CricBuzz.exception.PlayerNotFoundException;
import com.example.CricBuzz.service.ProfileService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/profile")
public class ProfileController {

    @Autowired
    ProfileService profileService;

    @PostMapping
    public ResponseEntity addProfile(@RequestBody ProfileRequest profileRequest,
                                     @RequestParam("player-id")int playerId){
        try{
            return new ResponseEntity(profileService.addProfile(profileRequest,playerId), HttpStatus.CREATED);
        }
        catch(PlayerNotFoundException e){
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }

    }
}
