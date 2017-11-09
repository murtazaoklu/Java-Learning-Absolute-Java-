/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author Tosun Pasha
 */
public class EchoServer {
    public static final int SERVER_PORT = 8765;
    public static void main(String[] args){
        try{
            final ServerSocket serverSock = new ServerSocket(SERVER_PORT);
            Socket sock = null;
            EchoThread thread = null;
            while(true){
            sock = serverSock.accept();
            thread = new EchoThread(sock);
            thread.start();
        }
        }
        catch(Exception e){
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }
}
