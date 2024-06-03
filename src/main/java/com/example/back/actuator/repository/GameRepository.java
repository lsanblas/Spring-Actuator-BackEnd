package com.example.back.actuator.repository;

import com.example.back.actuator.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GameRepository extends JpaRepository<Game, Integer> {
    Optional<Game> findGameByGameId(String gameId);
}
