package com.munchkin.game.cards;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>(Arrays.asList(
                new PlayerRace("Elf", "+1 to Run Away. You go up one level for every monster you help someone else kill."),
                new PlayerRace("Dwarf", "You can carry any number of Big items. You can have 6 cards in your hand."),
                new PlayerRace("Halfling", "-1 to Run Away. You may sell one item each turn for double price (other items are at normal price)."),
                new PlayerRace("Orc", "An Orc that is hit with a curse can always choose to ignore the curse and lose a level instead -- unless he's already at Level 1. " +
                                                         "When an Orc fighting alone defeats a monster by more than 10, he goes up an extra level."),

                new PlayerClass("Cleric", "When it is time for you to draw a card face-up, you may instead take the top card from the appropriate discard pile. " +
                                                            "You must then discard one card from your hand. You may discard up to 3 cards in combat against an Undead creature. " +
                                                            "Each discard gives you a +3 bonus."),

                new PlayerClass("Warrior", "You may discard up to 3 cards in combat, each one gives you a +1 bonus. You win ties in combat."),

                new PlayerClass("Thief", "You may discard a card to backstab another player (-2 in combat). You may do this only once per victim per combat, but if two " +
                                                           "players are fighting a monster together, you may backstab each of them. You may discard a card to try to steal a small item " +
                                                           "carried by another player. Roll a die; 4 or more succeeds. Otherwise, you get whacked and lose 1 Level."),

                new PlayerClass("Wizard", "You may discard upt o 3 cards after rolling the die to Run Away; each one gives you a +1 bonus to flee. " +
                                                            "You may discard your whole hand (minimum of 3 cards) to charm a single Monster instead of fighting it. " +
                                                            "Discard the Monster and take its Treasure, but don't gain levels. If there are other monsters in the combat, fight them normally."))
        );
    }

    public ArrayList<Card> getDeck() {
        return this.deck;
    }
}
