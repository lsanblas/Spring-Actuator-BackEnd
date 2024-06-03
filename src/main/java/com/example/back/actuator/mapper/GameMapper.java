package com.example.back.actuator.mapper;

import com.example.back.actuator.controller.request.GameRequest;
import com.example.back.actuator.controller.response.GameResponse;
import com.example.back.actuator.entity.Game;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface GameMapper {
    GameMapper INSTANCE = Mappers.getMapper(GameMapper.class);

    Game GameRequesttoGame(GameRequest gameRequest);

    GameResponse GametoGameResponse(Game game);
}
