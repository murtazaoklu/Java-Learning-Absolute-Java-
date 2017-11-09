/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;


import java.net.Socket;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author Tosun Pasha
 */
public class EchoThread extends Thread{
    private final Socket socket;
public EchoThread(Socket _socket){
    socket = _socket;
}    

public void run(){
    try{
        System.out.println("**New connection from "+ socket.getInetAddress() 
                + ":" + socket.getPort() + " **");
        final ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
        final ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
        Message msg = null;
        int count = 0;
        do{
            msg = (Message)input.readObject();
            System.out.println("[" + socket.getInetAddress() 
                    + ":" + socket.getPort() + "]" + msg.theMessage);
            count ++;
            output.writeObject(new Message("Received message #" + count));
            
        }
        while(!msg.theMessage.toUpperCase().equals("EXIT"));
        System.out.println("** Closing connection with " +
                socket.getInetAddress() + ":" + socket.getPort() + " **");
        socket.close();
    }
    catch(Exception e){
        System.err.println("Error: " + e.getMessage());
        e.printStackTrace(System.err);
    }
}

    void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
