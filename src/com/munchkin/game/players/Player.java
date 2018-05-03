package com.munchkin.game.players;

import com.munchkin.game.cards.Card;
import com.munchkin.game.cards.PlayerClass;
import com.munchkin.game.cards.PlayerRace;

import java.util.ArrayList;

public class Player {
    PlayerClass playerClass;
    PlayerRace playerRace;
    Gender gender;
    int level;
    int combatStrength;
    ArrayList<Card> hand;

    public Player(Gender gender){
        // Everyone starts as a Level 1 human with no class.
        this.playerRace = new PlayerRace("Human", "A normal human-being.");
        this.gender = gender;
        this.level = 1;
        this.combatStrength = level;
    }
}
