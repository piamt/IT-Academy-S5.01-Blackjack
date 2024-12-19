package com.pia.itacademy.Blackjack.mysql.service;

import com.pia.itacademy.Blackjack.exception.PlayerAlreadyExistsException;
import com.pia.itacademy.Blackjack.exception.PlayerNotFoundException;
import com.pia.itacademy.Blackjack.mysql.entity.Player;

import java.util.List;

public interface PlayerService {
    List<Player> findAllPlayers();
    Player savePlayer(Player player) throws PlayerAlreadyExistsException;
    Player updatePlayerName(Integer id, String name) throws PlayerNotFoundException;
    void deletePlayer(Integer id);
    Player getPlayerById(Integer id) throws PlayerNotFoundException;
    Player getPlayerByName(String name) throws PlayerNotFoundException;
}
