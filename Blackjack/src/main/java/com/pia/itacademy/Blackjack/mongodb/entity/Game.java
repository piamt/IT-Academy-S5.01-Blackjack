package com.pia.itacademy.Blackjack.mongodb.entity;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

@Document(collection = "game")
public class Game {

    @Transient
    public static final String SEQUENCE_NAME = "game_sequence";

    @Id
    private Integer id;

    private Integer playerId;

   // private GameState gameState;
   // private GameState gameStateSplit;
}
