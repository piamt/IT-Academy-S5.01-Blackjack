package com.pia.itacademy.Blackjack.controller;

import com.pia.itacademy.Blackjack.exception.PlayerAlreadyExistsException;
import com.pia.itacademy.Blackjack.exception.PlayerNotFoundException;
import com.pia.itacademy.Blackjack.mysql.entity.Player;
import com.pia.itacademy.Blackjack.mysql.service.PlayerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/player")
@Tag(name = "BlackJack", description = "Operaciones relacionadas con el juego BlackJack")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @PostMapping("/new")
    @Operation(summary = "Verificar el estado del juego", description = "Este endpoint devuelve el estado actual del juego BlackJack.")
    public ResponseEntity<Player> savePlayer(@Valid @RequestBody Player player) throws PlayerAlreadyExistsException {
        return ResponseEntity.ok(playerService.savePlayer(player));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Player> updatePlayerName(@PathVariable Integer id, @RequestBody String name) throws PlayerNotFoundException {
        return ResponseEntity.ok(playerService.updatePlayerName(id, name));
    }
}
