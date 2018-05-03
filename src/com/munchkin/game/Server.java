package com.munchkin.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.net.ServerSocket;
import com.badlogic.gdx.net.ServerSocketHints;
import com.badlogic.gdx.net.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Server {
    public Server(){
        new Thread(new Runnable(){

            @Override
            public void run() {
                ServerSocketHints serverSocketHints = new ServerSocketHints();
                serverSocketHints.acceptTimeout = 0; // disables timeout

                ServerSocket serverSocket = Gdx.net.newServerSocket(Net.Protocol.TCP, 1234, serverSocketHints);

                while (true) {
                    Socket socket = serverSocket.accept(null);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                    try{
                        System.out.println(bufferedReader.readLine());
                    }
                    catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
