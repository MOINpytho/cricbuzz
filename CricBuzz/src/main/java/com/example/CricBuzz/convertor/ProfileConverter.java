package com.example.CricBuzz.convertor;

import com.example.CricBuzz.dto.request.ProfileRequest;
import com.example.CricBuzz.dto.response.ProfileResponse;
import com.example.CricBuzz.model.PlayerProfile;

public class ProfileConverter {
    public static PlayerProfile profileRequestToProfile(ProfileRequest profileRequest){
        return PlayerProfile.builder()
                .battingAvg(profileRequest.getBattingAvg())
                .bowlingAvg(profileRequest.getBowlingAvg())
                .runsScored(profileRequest.getRunsScored())
                .wicketsTaken(profileRequest.getWicketsTaken())
                .build();
    }

    public static ProfileResponse profileToProfileResponse(PlayerProfile playerProfile){
        return ProfileResponse.builder()
                .runsScored(playerProfile.getRunsScored())
                .wicketsTaken((playerProfile.getWicketsTaken()))
                .battingAvg(playerProfile.getBattingAvg())
                .bowlingAvg(playerProfile.getBowlingAvg())
                .player(PlayerConverter.playerToPlayerResponse(playerProfile.getPlayer()))
                .build();
    }
}
