package com.example.CricBuzz.dto.response;

import com.example.CricBuzz.model.Team;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class MatchResponse {
    String title;

    String venue;

    int noOfOvers;

    Date createdAt;

    List<TeamResponse> teams;
}
