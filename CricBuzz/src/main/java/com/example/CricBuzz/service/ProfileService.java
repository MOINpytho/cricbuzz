package com.example.CricBuzz.service;

import com.example.CricBuzz.convertor.ProfileConverter;
import com.example.CricBuzz.dto.request.ProfileRequest;
import com.example.CricBuzz.dto.response.ProfileResponse;
import com.example.CricBuzz.exception.PlayerNotFoundException;
import com.example.CricBuzz.model.Player;
import com.example.CricBuzz.model.PlayerProfile;
import com.example.CricBuzz.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {

    @Autowired
    PlayerRepository playerRepository;

    public ProfileResponse addProfile(ProfileRequest profileRequest,int playerId) {
//findById returns Optional object as default
        Optional<Player> optionalPlayer = playerRepository.findById(playerId);
        if(optionalPlayer.isEmpty()) {
            throw new PlayerNotFoundException("Invalid Player Id");
        }
        Player player = optionalPlayer.get();

        //---------------OR-------------------------

//       Player player =  playerRepository.findById(playerId)
//               .orElseThrow(() -> new PlayerNotFoundException("Invalid Player Id"));

       PlayerProfile playerProfile = ProfileConverter.profileRequestToProfile(profileRequest);
       player.setProfile(playerProfile);
       playerProfile.setPlayer(player);

       //we have done cascade so no need to save profile explicitly
       Player savedPlayer = playerRepository.save(player);

       //player has profile attribute which can be accessed directly
       return ProfileConverter.profileToProfileResponse(savedPlayer.getProfile());
    }
}
