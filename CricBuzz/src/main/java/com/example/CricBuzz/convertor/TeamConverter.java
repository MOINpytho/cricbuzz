package com.example.CricBuzz.convertor;

import com.example.CricBuzz.dto.request.TeamRequest;
import com.example.CricBuzz.dto.response.TeamResponse;
import com.example.CricBuzz.model.Team;

public class TeamConverter {
    //defined static so that it can be used without creating any object of class
    public static Team teamRequestToTeam(TeamRequest teamRequest){
        return Team.builder()
                .teamName(teamRequest.getTeamName())
                .ranking(teamRequest.getRanking())
                .coach(teamRequest.getCoach())
                .iccPoints(teamRequest.getIccPoints())
                .build();
    }

    public static TeamResponse teamToTeamResponse(Team team){
        return TeamResponse.builder()
                .coach(team.getCoach())
                .ranking(team.getRanking())
                .teamName(team.getTeamName())
                .build();
    }
}
