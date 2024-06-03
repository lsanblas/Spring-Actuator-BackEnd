package com.example.back.actuator.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameResponse {
    private String gameId;
    private String name;
    private String description;
    private String genre;
    private String studio;
}
