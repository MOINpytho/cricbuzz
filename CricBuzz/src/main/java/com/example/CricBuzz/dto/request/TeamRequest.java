package com.example.CricBuzz.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TeamRequest {

    String teamName;

    int ranking;

    int iccPoints;

    String coach;
}
