package com.example.CricBuzz.service;

import com.example.CricBuzz.convertor.MatchConverter;
import com.example.CricBuzz.dto.request.MatchRequest;
import com.example.CricBuzz.dto.response.MatchResponse;
import com.example.CricBuzz.exception.PlayerNotFoundException;
import com.example.CricBuzz.exception.TeamNotFoundException;
import com.example.CricBuzz.model.CricketMatch;
import com.example.CricBuzz.model.Team;
import com.example.CricBuzz.repository.MatchRepository;
import com.example.CricBuzz.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class MatchService {
    @Autowired
    MatchRepository matchRepository;

    @Autowired
    TeamRepository teamRepository;

    public MatchResponse addMatch(MatchRequest matchRequest, int teamAId, int teamBId){

        //findByID returns an Optional Object
        Optional<Team> optionalTeamAId =  teamRepository.findById(teamAId);
        Optional<Team> optionalTeamBId =  teamRepository.findById(teamBId);

        if(optionalTeamAId.isEmpty() || optionalTeamBId.isEmpty()){
            throw new TeamNotFoundException("Invalid Team Id");
        }
        Team teamA = optionalTeamAId.get();
        Team teamB = optionalTeamBId.get();

        CricketMatch cricketMatch = MatchConverter.matchRequestToMatch(matchRequest);

        //this will update the cricketMatch entity
        cricketMatch.getTeams().add(teamA);
        cricketMatch.getTeams().add(teamB);

        //this will update values of team entity
        teamA.getMatches().add(cricketMatch);
        teamB.getMatches().add(cricketMatch);


        CricketMatch savedMatch = matchRepository.save(cricketMatch);


        //we can get both team from match object because it saved in list which can be accessed directly
        return MatchConverter.matchToMatchResponse(savedMatch);
    }
}
