package com.pia.itacademy.Blackjack.mongodb.service;

import com.pia.itacademy.Blackjack.exception.GameNotFoundException;
import com.pia.itacademy.Blackjack.mongodb.entity.Game;
import com.pia.itacademy.Blackjack.mongodb.entity.Move;

import java.util.List;

public interface GameService {
    List<Game> findAllGames() throws GameNotFoundException;
    Game saveGame(Game game);
    Game addMoveToGame(Integer id, Move move) throws GameNotFoundException;
    Game getGameById(Integer id) throws GameNotFoundException;
    void deleteGame(Integer id) throws GameNotFoundException;
}
