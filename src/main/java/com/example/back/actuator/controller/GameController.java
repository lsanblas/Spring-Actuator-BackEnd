package com.example.back.actuator.controller;

import com.example.back.actuator.controller.request.GameRequest;
import com.example.back.actuator.controller.response.GameResponse;
import com.example.back.actuator.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/game")
public class GameController {

    private final GameService gameService;

    @PostMapping
    public ResponseEntity<String> create(@RequestBody GameRequest request){
        return ResponseEntity.ok().body(this.gameService.create(request));
    }

    @GetMapping
    public ResponseEntity<GameResponse> get(@RequestParam(name = "id") String id){
        return ResponseEntity.ok().body(this.gameService.get(id));
    }

    @DeleteMapping
    public ResponseEntity<String> delete(@RequestParam(name = "id") String id){
        this.gameService.delete(id);
        return ResponseEntity.ok().build();
    }
}
