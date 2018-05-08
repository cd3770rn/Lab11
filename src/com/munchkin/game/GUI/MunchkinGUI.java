package com.munchkin.game.GUI;

import com.munchkin.game.Main;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MunchkinGUI extends JFrame{

    private JButton playButton;
    private JButton settingsButton;
    private JButton exitButton;
    private JButton settingsAcceptButton;
    private JButton settingsBackButton;
    private JButton singlePlayerButton;
    private JButton multiPlayerButton;
    private JButton gameMenuBackButton;
    private JButton howToPlayButton;
    private JButton multiPlayerConfirmButton;
    private JButton multiPlayerBackButton;
    private JComboBox resolutionComboBox;
    private JCheckBox fullscreenCheckBox;
    private JLabel logo;
    private JPanel mainPanel;
    private JPanel mainMenu;
    private JPanel settingsMenu;
    private JPanel gameMenu;
    private JPanel singlePlayerMenu;
    private JPanel multiPlayerMenu;
    private JTextField serverAddressTextField;
    private JPanel serverHostJoinSelection;
    private JButton multiplayerHostGameButton;
    private JButton multiplayerJoinSessionButton;
    private JButton multiplayerSessionBackButton;

    private Dimension screenResolution = Toolkit.getDefaultToolkit().getScreenSize();
    private double screenHeight = screenResolution.getHeight();
    private double screenWidth = screenResolution.getWidth();
    private static String MAIN_MENU = "main menu panel";
    private static String SETTINGS_MENU = "settings menu panel";
    private static String GAME_MENU = "game select menu panel";
    private static String SINGLEPLAYER_MENU = "single player menu panel";
    private static String MULTIPLAYER_MENU = "multiplayer menu panel";
    private static String HOST_JOIN_SESSION_MENU = "host/join server menu panel";

    public MunchkinGUI(){
        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        init();

        mainPanel.add(mainMenu, MAIN_MENU);
        mainPanel.add(settingsMenu, SETTINGS_MENU);
        mainPanel.add(gameMenu, GAME_MENU);
        mainPanel.add(singlePlayerMenu, SINGLEPLAYER_MENU);
        mainPanel.add(multiPlayerMenu, MULTIPLAYER_MENU);
        mainPanel.add(serverHostJoinSelection, HOST_JOIN_SESSION_MENU);

        /* MAIN MENU */
        playButton.addMouseListener(new MouseListener() {
            boolean cursorOnButton;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                playButton.setLocation(playButton.getX(), playButton.getY()+2);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                playButton.setLocation(playButton.getX(), playButton.getY()-2);

                CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
                if (cursorOnButton){
                    cardLayout.show(mainPanel, GAME_MENU);
                }

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                playButton.setLocation(playButton.getX(), playButton.getY()+3);
                cursorOnButton = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                playButton.setLocation(playButton.getX(), playButton.getY()-3);
                cursorOnButton = false;
            }
        });
        settingsButton.addMouseListener(new MouseListener() {
            boolean cursorOnButton;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                settingsButton.setLocation(settingsButton.getX(), settingsButton.getY()+2);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                settingsButton.setLocation(settingsButton.getX(), settingsButton.getY()-2);

                CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
                if (cursorOnButton){
                    cardLayout.show(mainPanel, SETTINGS_MENU);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                settingsButton.setLocation(settingsButton.getX(), settingsButton.getY()+3);
                cursorOnButton = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                settingsButton.setLocation(settingsButton.getX(), settingsButton.getY()-3);
                cursorOnButton = false;
            }
        });
        howToPlayButton.addMouseListener(new MouseListener() {
            boolean cursorOnButton;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                howToPlayButton.setLocation(howToPlayButton.getX(), howToPlayButton.getY()+2);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                howToPlayButton.setLocation(howToPlayButton.getX(), howToPlayButton.getY()-2);
                // If user has clicked the Exit button, but moves their mouse off of the button, do not exit.
                if (cursorOnButton){

                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                howToPlayButton.setLocation(howToPlayButton.getX(), howToPlayButton.getY()+3);
                cursorOnButton = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                howToPlayButton.setLocation(howToPlayButton.getX(), howToPlayButton.getY()-3);
                cursorOnButton = false;
            }
        });
        exitButton.addMouseListener(new MouseListener() {
            boolean cursorOnButton;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                exitButton.setLocation(exitButton.getX(), exitButton.getY()+2);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                exitButton.setLocation(exitButton.getX(), exitButton.getY()-2);
                // If user has clicked the Exit button, but moves their mouse off of the button, do not exit.
                if (cursorOnButton){
                    dispose();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                exitButton.setLocation(exitButton.getX(), exitButton.getY()+3);
                cursorOnButton = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                exitButton.setLocation(exitButton.getX(), exitButton.getY()-3);
                cursorOnButton = false;
            }
        });

        /* SETTINGS MENU */
        settingsAcceptButton.addMouseListener(new MouseListener() {
            boolean cursorOnButton;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                settingsAcceptButton.setLocation(settingsAcceptButton.getX(), settingsAcceptButton.getY()+2);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                settingsAcceptButton.setLocation(settingsAcceptButton.getX(), settingsAcceptButton.getY()-2);
                if (cursorOnButton) {
                    if (fullscreenCheckBox.isSelected()) {
                        Main.gui.setExtendedState(MAXIMIZED_BOTH);
                    } else {
                        DisplayResolution displayResolution = (DisplayResolution) resolutionComboBox.getSelectedItem();
                        Main.gui.setBounds(0, 0, displayResolution.getX(), displayResolution.getY());
                    }
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                settingsAcceptButton.setLocation(settingsAcceptButton.getX(), settingsAcceptButton.getY()+3);
                cursorOnButton = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                settingsAcceptButton.setLocation(settingsAcceptButton.getX(), settingsAcceptButton.getY()-3);
                cursorOnButton = false;
            }
        });
        settingsBackButton.addMouseListener(new MouseListener() {
            boolean cursorOnButton;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                settingsBackButton.setLocation(settingsBackButton.getX(), settingsBackButton.getY()+2);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                settingsBackButton.setLocation(settingsBackButton.getX(), settingsBackButton.getY()-2);

                CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
                if (cursorOnButton){
                    cardLayout.show(mainPanel, MAIN_MENU);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                settingsBackButton.setLocation(settingsBackButton.getX(), settingsBackButton.getY()+3);
                cursorOnButton = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                settingsBackButton.setLocation(settingsBackButton.getX(), settingsBackButton.getY()-3);
                cursorOnButton = false;
            }
        });
        resolutionComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!fullscreenCheckBox.isSelected()) {
                    if (resolutionComboBox.getSelectedIndex() != 11) {
                        settingsAcceptButton.setVisible(true);
                    }
                    else{
                        settingsAcceptButton.setVisible(false);
                    }
                }
            }
        });
        fullscreenCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsAcceptButton.setVisible(!settingsAcceptButton.isVisible());
            }
        });

        /* GAME SELECT MENU */
        singlePlayerButton.addMouseListener(new MouseListener() {
            boolean cursorOnButton;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                singlePlayerButton.setLocation(singlePlayerButton.getX(), singlePlayerButton.getY()+2);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                singlePlayerButton.setLocation(singlePlayerButton.getX(), singlePlayerButton.getY()-2);
                // If user has clicked the Exit button, but moves their mouse off of the button, do not exit.
                if (cursorOnButton){

                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                cursorOnButton = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                cursorOnButton = false;
            }
        });
        multiPlayerButton.addMouseListener(new MouseListener() {
            boolean cursorOnButton;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                multiPlayerButton.setLocation(multiPlayerButton.getX(), multiPlayerButton.getY()+2);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                multiPlayerButton.setLocation(multiPlayerButton.getX(), multiPlayerButton.getY()-2);
                // If user has clicked the Exit button, but moves their mouse off of the button, do not exit.

                CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
                if (cursorOnButton){
                    cardLayout.show(mainPanel, HOST_JOIN_SESSION_MENU);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                multiPlayerButton.setLocation(multiPlayerButton.getX(), multiPlayerButton.getY()+3);
                cursorOnButton = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                multiPlayerButton.setLocation(multiPlayerButton.getX(), multiPlayerButton.getY()-3);
                cursorOnButton = false;
            }
        });
        gameMenuBackButton.addMouseListener(new MouseListener() {
            boolean cursorOnButton;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                gameMenuBackButton.setLocation(gameMenuBackButton.getX(), gameMenuBackButton.getY()+2);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                gameMenuBackButton.setLocation(gameMenuBackButton.getX(), gameMenuBackButton.getY()-2);
                // If user has clicked the Exit button, but moves their mouse off of the button, do not exit.

                CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
                if (cursorOnButton){
                    cardLayout.show(mainPanel, MAIN_MENU);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                gameMenuBackButton.setLocation(gameMenuBackButton.getX(), gameMenuBackButton.getY()+3);
                cursorOnButton = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                gameMenuBackButton.setLocation(gameMenuBackButton.getX(), gameMenuBackButton.getY()-3);
                cursorOnButton = false;
            }
        });

        /* SINGLEPLAYER MENU */

        /* HOST / JOIN SESSION MENU */
        multiplayerHostGameButton.addMouseListener(new MouseListener() {
            boolean cursorOnButton;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                multiplayerHostGameButton.setLocation(multiplayerHostGameButton.getX(), multiplayerHostGameButton.getY()+2);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                multiplayerHostGameButton.setLocation(multiplayerHostGameButton.getX(), multiplayerHostGameButton.getY()-2);
                // If user has clicked the Exit button, but moves their mouse off of the button, do not exit.
                if (cursorOnButton){
                    //Server server = new Server();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                multiplayerHostGameButton.setLocation(multiplayerHostGameButton.getX(), multiplayerHostGameButton.getY()+3);
                cursorOnButton = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                multiplayerHostGameButton.setLocation(multiplayerHostGameButton.getX(), multiplayerHostGameButton.getY()-3);
                cursorOnButton = false;
            }
        });
        multiplayerJoinSessionButton.addMouseListener(new MouseListener() {
            boolean cursorOnButton;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                multiplayerJoinSessionButton.setLocation(multiplayerJoinSessionButton.getX(), multiplayerJoinSessionButton.getY()+2);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                multiplayerJoinSessionButton.setLocation(multiplayerJoinSessionButton.getX(), multiplayerJoinSessionButton.getY()-2);
                // If user has clicked the Exit button, but moves their mouse off of the button, do not exit.

                CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
                if (cursorOnButton){
                    cardLayout.show(mainPanel, MULTIPLAYER_MENU);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                multiplayerJoinSessionButton.setLocation(multiplayerJoinSessionButton.getX(), multiplayerJoinSessionButton.getY()+3);
                cursorOnButton = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                multiplayerJoinSessionButton.setLocation(multiplayerJoinSessionButton.getX(), multiplayerJoinSessionButton.getY()-3);
                cursorOnButton = false;
            }
        });
        multiplayerSessionBackButton.addMouseListener(new MouseListener() {
            boolean cursorOnButton;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                multiplayerSessionBackButton.setLocation(multiplayerSessionBackButton.getX(), multiplayerSessionBackButton.getY()+2);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                multiplayerSessionBackButton.setLocation(multiplayerSessionBackButton.getX(), multiplayerSessionBackButton.getY()-2);
                // If user has clicked the Exit button, but moves their mouse off of the button, do not exit.

                CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
                if (cursorOnButton){
                    cardLayout.show(mainPanel, GAME_MENU);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                multiplayerSessionBackButton.setLocation(multiplayerSessionBackButton.getX(), multiplayerSessionBackButton.getY()+3);
                cursorOnButton = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                multiplayerSessionBackButton.setLocation(multiplayerSessionBackButton.getX(), multiplayerSessionBackButton.getY()-3);
                cursorOnButton = false;
            }
        });

        /* MULTIPLAYER MENU */
        multiPlayerConfirmButton.addMouseListener(new MouseListener() {
            boolean cursorOnButton;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                multiPlayerConfirmButton.setLocation(multiPlayerConfirmButton.getX(), multiPlayerConfirmButton.getY()+2);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                multiPlayerConfirmButton.setLocation(multiPlayerConfirmButton.getX(), multiPlayerConfirmButton.getY()-2);
                // If user has clicked the Exit button, but moves their mouse off of the button, do not exit.
                if (cursorOnButton){

                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                multiPlayerConfirmButton.setLocation(multiPlayerConfirmButton.getX(), multiPlayerConfirmButton.getY()+3);
                cursorOnButton = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                multiPlayerConfirmButton.setLocation(multiPlayerConfirmButton.getX(), multiPlayerConfirmButton.getY()-3);
                cursorOnButton = false;
            }
        });
        multiPlayerBackButton.addMouseListener(new MouseListener() {
            boolean cursorOnButton;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                multiPlayerBackButton.setLocation(multiPlayerBackButton.getX(), multiPlayerBackButton.getY()+2);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                multiPlayerBackButton.setLocation(multiPlayerBackButton.getX(), multiPlayerBackButton.getY()-2);
                // If user has clicked the Exit button, but moves their mouse off of the button, do not exit.

                CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
                if (cursorOnButton){
                    cardLayout.show(mainPanel, HOST_JOIN_SESSION_MENU);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                multiPlayerBackButton.setLocation(multiPlayerBackButton.getX(), multiPlayerBackButton.getY()+3);
                cursorOnButton = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                multiPlayerBackButton.setLocation(multiPlayerBackButton.getX(), multiPlayerBackButton.getY()-3);
                cursorOnButton = false;
            }
        });


    }

    private void init(){
        JButton[] jButtons = {
                playButton,
                settingsButton,
                howToPlayButton,
                exitButton,

                settingsAcceptButton,
                settingsBackButton,

                singlePlayerButton,
                multiPlayerButton,
                gameMenuBackButton,

                multiPlayerConfirmButton,
                multiPlayerBackButton,

                multiplayerHostGameButton,
                multiplayerJoinSessionButton,
                multiplayerSessionBackButton
        };

        // Initialize each button in the GUI
        for (JButton jButton : jButtons) {
            jButton.setBorder(null);
            jButton.setContentAreaFilled(false);
            jButton.setFocusPainted(false);
        }

        // Initialize combo box with common resolutions
        for (DisplayResolution.Resolution resolution : DisplayResolution.Resolution.values()){
            resolutionComboBox.addItem(new DisplayResolution(resolution));
        }

        resolutionComboBox.setSelectedIndex(11);
    }
}
