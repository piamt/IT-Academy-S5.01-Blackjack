package com.pia.itacademy.Blackjack.mysql.service;

import com.pia.itacademy.Blackjack.exception.PlayerAlreadyExistsException;
import com.pia.itacademy.Blackjack.exception.PlayerNotFoundException;
import com.pia.itacademy.Blackjack.mysql.entity.Player;
import com.pia.itacademy.Blackjack.mysql.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    @Override
    public List<Player> findAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public Player savePlayer(Player player) throws PlayerAlreadyExistsException {
        if (playerRepository.existsByName(player.getName())) throw new PlayerAlreadyExistsException("Player name already exists in the ddbb");
        return playerRepository.save(player);
    }

    @Override
    public Player updatePlayerName(Integer id, String name) throws PlayerNotFoundException {
        Optional<Player> playerOp = playerRepository.findById(id);
        if (playerOp.isEmpty()) throw new PlayerNotFoundException("Player does not exist for id");

        Player playerDb = playerOp.get();
        if(Objects.nonNull(name) && !"".equalsIgnoreCase(name)) {
            playerDb.setName(name);
        }

        return playerRepository.save(playerDb);
    }

    @Override
    public void deletePlayer(Integer id) {
        playerRepository.deleteById(id);
    }

    @Override
    public Player getPlayerById(Integer id) throws PlayerNotFoundException {
        Optional<Player> player = playerRepository.findById(id);
        if (player.isEmpty()) throw new PlayerNotFoundException("Player does not exist for id");
        return player.get();
    }

    @Override
    public Player getPlayerByName(String name) throws PlayerNotFoundException {
        if (playerRepository.existsByName(name)) throw new PlayerNotFoundException("Player name not found in the ddbb");
        return playerRepository.findByName(name);
    }
}
