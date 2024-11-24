package com.example.CricBuzz.service;

import com.example.CricBuzz.convertor.PlayerConverter;
import com.example.CricBuzz.dto.request.PlayerRequest;
import com.example.CricBuzz.dto.response.PlayerResponse;
import com.example.CricBuzz.exception.PlayerNotFoundException;
import com.example.CricBuzz.model.Player;
import com.example.CricBuzz.model.enums.Speciality;
import com.example.CricBuzz.repository.PlayerRepository;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service


public class PlayerService {
    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    JavaMailSender javaMailSender;

    public PlayerResponse addPlayer(PlayerRequest playerRequest) {
        Player player = PlayerConverter.playerRequestToPlayer(playerRequest);
        Player savedPlayer =  playerRepository.save(player);
        sendEmail(savedPlayer);
        return PlayerConverter.playerToPlayerResponse(savedPlayer);
    }

    private void sendEmail(Player player) {
        String text = "Congrats" + player.getName() + "you have been Registered to the CricBuzz";
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("accio2620@gmail.com");
        message.setTo(player.getEmail());
        message.setSubject("Registration Successfull");
        message.setText(text);

        javaMailSender.send(message);
    }
    public List<PlayerResponse> getAllByAgeGreaterThan(int age){
        List<Player> players = playerRepository.findAllByAgeGreaterThanEqual(age);
        List<PlayerResponse> playerResponses= new ArrayList<>();
        for(Player player: players){
            playerResponses.add(PlayerConverter.playerToPlayerResponse(player));
        }
        return playerResponses;
    }


    public List<PlayerResponse> getAllByAgeGreaterThanAndSpeciality(int age, Speciality speciality) {
        List<Player> players = playerRepository.findAllByAgeGreaterThanAndSpeciality(age,speciality);
        List<PlayerResponse> playerResponses = new ArrayList<>();
        for(Player player:players){
            playerResponses.add(PlayerConverter.playerToPlayerResponse(player));
        }
        return playerResponses;
    }

    public Player getPlayer(int playerId){
        Optional<Player> playerOptional = playerRepository.findById(playerId);
        if(playerOptional.isEmpty()) throw new PlayerNotFoundException("Invalid input");
        return playerOptional.get();
    }
}
