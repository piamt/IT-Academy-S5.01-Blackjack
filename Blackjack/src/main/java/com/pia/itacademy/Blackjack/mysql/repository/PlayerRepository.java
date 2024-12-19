package com.pia.itacademy.Blackjack.mysql.repository;

import com.pia.itacademy.Blackjack.mysql.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
    boolean existsByName(String name);
    Player findByName(String name);
}
