package com.pia.itacademy.Blackjack.mongodb.entity;

import com.pia.itacademy.Blackjack.enums.Card;
import com.pia.itacademy.Blackjack.enums.MoveType;
import lombok.Getter;

@Getter
public class Move {

    private MoveType type;
    private double addedQuantity;
    private Card addedCard;
    private int addedPoints;
}
