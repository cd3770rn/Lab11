package com.munchkin.game;

import com.munchkin.game.GUI.MunchkinGUI;

import javax.swing.*;

public class Main {
    public static MunchkinGUI gui;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        gui = new MunchkinGUI();

        // Player 1 draws a card
        // Player 1's client sends card info to server over a socket
        // Server receives info from Player 1's client
        // Server tries to relay card info to other clients until it is successfully received
        // Once received, all clients (except for Player 1's client) show the card that Player 1 drew.
        // If the card was a monster, other players may power up the monster to make it harder to defeat.


    }


}
