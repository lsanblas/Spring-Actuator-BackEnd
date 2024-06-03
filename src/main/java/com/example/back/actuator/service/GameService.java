package com.example.back.actuator.service;

import com.example.back.actuator.controller.request.GameRequest;
import com.example.back.actuator.controller.response.GameResponse;
import com.example.back.actuator.entity.Game;
import com.example.back.actuator.exception.GameNotFoundException;
import com.example.back.actuator.mapper.GameMapper;
import com.example.back.actuator.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class GameService {

    private final GameRepository gameRepository;
    private final GameMapper gameMapper;

    public String create(GameRequest gameRequest){
        Game game = this.gameMapper.GameRequesttoGame(gameRequest);
        UUID uuid = UUID.randomUUID();
        game.setGameId(uuid.toString());
        game.setCreateDate(new Date());
        this.gameRepository.save(game);
        return uuid.toString();
    }

    public GameResponse get(String id){
        return this.gameMapper.GametoGameResponse(this.gameRepository.findGameByGameId(id).orElseThrow(() -> new GameNotFoundException(id)));
    }

    public void delete(String id){
        this.gameRepository.deleteById(this.gameRepository.findGameByGameId(id).orElseThrow(() -> new GameNotFoundException(id)).getId());
    }

}
