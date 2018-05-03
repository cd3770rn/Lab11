package com.munchkin.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.net.Socket;
import com.badlogic.gdx.net.SocketHints;
import com.munchkin.game.GUI.MunchkinGUI;

public class Client {
    public Client() {
        // This code should run when the user presses a button
        SocketHints socketHints = new SocketHints();
        socketHints.connectTimeout = 10000;
        //Socket socket = Gdx.net.newClientSocket(Net.Protocol.TCP, MunchkinGUI.serverAddressTextField.getText(), 1234, socketHints);

    }
}
