package com.example.CricBuzz.convertor;

import com.example.CricBuzz.dto.request.MatchRequest;
import com.example.CricBuzz.dto.response.MatchResponse;
import com.example.CricBuzz.dto.response.TeamResponse;
import com.example.CricBuzz.model.CricketMatch;
import com.example.CricBuzz.model.Team;

import java.util.ArrayList;
import java.util.List;

public class MatchConverter {
    public static CricketMatch matchRequestToMatch(MatchRequest matchRequest){
        return CricketMatch.builder()
                .title(matchRequest.getTitle())
                .venue(matchRequest.getVenue())
                .noOfOvers(matchRequest.getNoOfOvers())
                .teams(new ArrayList<>())
                .build();
    }

    public static MatchResponse matchToMatchResponse(CricketMatch cricketMatch){
        Team teamA = cricketMatch.getTeams().get(0);
        Team teamB = cricketMatch.getTeams().get(1);

        List<TeamResponse> teamResponses = new ArrayList<>();
        teamResponses.add(TeamConverter.teamToTeamResponse(teamA));
        teamResponses.add(TeamConverter.teamToTeamResponse(teamB));

        return MatchResponse.builder()

                .title(cricketMatch.getTitle())
                .venue(cricketMatch.getVenue())
                .createdAt(cricketMatch.getCreatedAt())
                .teams(teamResponses)
                .noOfOvers(cricketMatch.getNoOfOvers())
                .build();
    }
}
