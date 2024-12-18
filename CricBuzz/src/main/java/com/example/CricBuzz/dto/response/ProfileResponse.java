package com.example.CricBuzz.dto.response;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ProfileResponse {
    int runsScored;

    int wicketsTaken;

    double battingAvg;

    double bowlingAvg;

    PlayerResponse player;
}
